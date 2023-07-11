SUMMARY = "A Comfortable FTP Program"
DESCRIPTION = "This program has been in service on UNIX systems since 1991 and is a \
popular alternative to the standard FTP program, /usr/bin/ftp. NcFTP \
offers many ease-of-use and performance enhancements over the stock FTP \
client and runs on a wide variety of UNIX platforms as well as \
operating systems like Microsoft Windows and Apple Mac OS X."
LICENSE = "ClArtistic"

PV = "3.2.6"

RPM_NAME = "ncftp-3.2.6-3.13.aarch64.rpm"
RPM_HASH = "7be274ff57bb63756a25ebf59308bac4992739603747e53dbb9e6e0f87cdae066877cc49e7627e26e601afd76d01c55e205cfca0fbb6848120917f8de4d2cd16"

RPROVIDES:${PN} += "ncftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
