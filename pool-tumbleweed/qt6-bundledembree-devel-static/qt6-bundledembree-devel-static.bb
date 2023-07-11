SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledembree-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "df0357aa71f2a445f37ede30a988b48508316f6d84efca74f659009355945a7f45ddf46b845eb8c79688606ce3cee226b70ea2849b91428d313757b25c61e499"

RPROVIDES:${PN} += "cmake-Qt6BundledEmbree \
qt6-bundledembree-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
