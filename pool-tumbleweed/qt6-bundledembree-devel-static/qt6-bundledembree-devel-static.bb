SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-bundledembree-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a90fc1d51436f29e9d8ed3310c076fbe181981f6aba46c04d47d6c43901ea28b1c460dfbb61576035133ffaefd5bca06943a46dc6511e25f8bceac8448ee75b6"

RPROVIDES:${PN} += "cmake-Qt6BundledEmbree \
qt6-bundledembree-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
