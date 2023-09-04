SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Perl bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "perl-obexftp-0.24.2-1.25.aarch64.rpm"
RPM_HASH = "ebed4415295db1832f0af560db256442c828144dcfb8db7aacca815b95b743f5be4636725ea892cb6b6ee1413b9deae061a253fda7f79ee6d9ebdeb54c1d1e4a"

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
