SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Ruby bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "ruby-obexftp-0.24.2-1.25.aarch64.rpm"
RPM_HASH = "78e2a465f79e785bf29c60bbf5e1138c90706c4474b4bbe3cb481ac01df7cdd84b56e0a57c32271fcd0fc00d5ddcf6dbff6bf57fe7cf39d1fbad8ed93bdb978b"

RPROVIDES:${PN} += "ruby-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
ruby-abi"

inherit rpm
