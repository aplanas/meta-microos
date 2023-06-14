SUMMARY = "X11 Present Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-present0-1.15-2.2.aarch64.rpm"
RPM_HASH = "92c5ceda1f233738ac0795f8b653ecb4094762ed102aa92e2c8fb7d22d3c3f674ded3369155f116c1a62dc887fc971979881091abaef8db530dcf93da32bd5f7"

RPROVIDES:${PN} += "libxcb-present.so.0 \
libxcb-present0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
