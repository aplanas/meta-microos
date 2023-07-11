SUMMARY = "A clipboard manager for Wayland"
DESCRIPTION = "A clipboard manager for Wayland with support for \
persisting copy buffers after an application exits."
LICENSE = "GPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "clipman-1.6.2-1.2.aarch64.rpm"
RPM_HASH = "0a1c8597440ba3e841fa2a057c52a5d71e5e45737a8fb465aff786f08c3896487d02963fa56ec8a221594c79b457589bd54c1fd6c365282125047ac8f9277779"

RPROVIDES:${PN} += "clipman"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
