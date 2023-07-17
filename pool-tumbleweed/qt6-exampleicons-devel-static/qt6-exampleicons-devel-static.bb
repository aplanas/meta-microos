SUMMARY = "Qt ExampleIcons module"
DESCRIPTION = "Qt icon library for examples. This private library can be used by Qt examples."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-exampleicons-devel-static-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "1d0e5ac3ee1ebc8a039a8ac1090d20c13554adc2d608a2b670b35704ae36d30b88d73a1adde22e7bb5e0ef9593a519af7502f097400a90811575dcaa39fa8e44"

RPROVIDES:${PN} += "cmake-Qt6ExampleIconsPrivate \
qt6-exampleicons-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
