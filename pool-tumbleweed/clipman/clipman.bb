SUMMARY = "A clipboard manager for Wayland"
DESCRIPTION = "A clipboard manager for Wayland with support for \
persisting copy buffers after an application exits."
LICENSE = "GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "clipman-1.6.1-1.9.aarch64.rpm"
RPM_HASH = "ab974efb21ba74e0de7a3d418e20c38635a177f34f507c77b962becdfb8178f5099773807d8e1bc364db3f9bf998e5c4708ca66b07a32c473247fbba03805bf8"

RPROVIDES:${PN} += "clipman \
clipman(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
