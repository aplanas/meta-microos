SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Perl bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "perl-obexftp-0.24.2-1.24.aarch64.rpm"
RPM_HASH = "f761b0a379d9ad9b4a69e6902a0849a9878ec77e34afdc64c41c2928651d039cb3af4d4dbcb64f62880e281766ec583b1577362d5137cbcf1a3c80ce050e8b97"

RPROVIDES:${PN} += "perl-OBEXFTP \
perl-OBEXFTP--client \
perl-OBEXFTPc \
perl-obexftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libobexftp.so.0 \
obexftp \
perl-base"

inherit rpm
