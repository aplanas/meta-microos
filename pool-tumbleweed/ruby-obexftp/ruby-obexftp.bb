SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Ruby bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "ruby-obexftp-0.24.2-1.24.aarch64.rpm"
RPM_HASH = "09cf6cc8a2c848b1ffecf6bd39527c7f638187688f6be0d019ac440e64dd9c46e09f137829c671eeb4a84308b353247d6b689fe4c946957f8661dd859c2976a9"

RPROVIDES:${PN} += "ruby-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
ruby-abi"

inherit rpm
