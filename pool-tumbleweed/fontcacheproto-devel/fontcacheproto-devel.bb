SUMMARY = "The X11 Protocol: Fontcache extension"
DESCRIPTION = "The Fontcache protocol headers for X11 development."
LICENSE = "BSD-2-Clause"

PV = "0.1.3"

RPM_NAME = "fontcacheproto-devel-0.1.3-4.19.aarch64.rpm"
RPM_HASH = "8c855d683910080a9ed44a8d2bcea2a8804d8d5e098da7b8cc2bc1d7bc4aab366e2cb20ac28d5c1abb706bd49d158a30815bfc175fb520fc894b842f88fe9ae6"

RPROVIDES:${PN} += "fontcacheproto-devel \
pkgconfig-fontcacheproto \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/fontcacheproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
