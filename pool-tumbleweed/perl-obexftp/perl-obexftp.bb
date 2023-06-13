SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Perl bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "perl-obexftp-0.24.2-1.22.aarch64.rpm"
RPM_HASH = "770f41b9bb3648fe215b8b2314b0d39105d213c4f996e811633d2fcf912e7c6aee6ffc1573396a319b514a36f992cbc6d63be4a7ff2106c5238783e0148e598f"

RPROVIDES:${PN} += "perl(OBEXFTP) \
perl(OBEXFTP::client) \
perl(OBEXFTPc) \
perl-obexftp \
perl-obexftp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libobexftp.so.0()(64bit) \
obexftp \
perl-base"

inherit rpm
