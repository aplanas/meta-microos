SUMMARY = "A Comfortable FTP Program"
DESCRIPTION = "This program has been in service on UNIX systems since 1991 and is a \
popular alternative to the standard FTP program, /usr/bin/ftp. NcFTP \
offers many ease-of-use and performance enhancements over the stock FTP \
client and runs on a wide variety of UNIX platforms as well as \
operating systems like Microsoft Windows and Apple Mac OS X."
LICENSE = "ClArtistic"

PV = "3.2.6"

RPM_NAME = "ncftp-3.2.6-3.12.aarch64.rpm"
RPM_HASH = "d4d33f26d2c46172366f0881ae33887c8f3f4aab804e807a7763f6aa32ab151b31c069f25f31436878e947344449807b4aa80a87949e4b95fc372187527ba936"

RPROVIDES:${PN} += "ncftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
