SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "38d66d5d3cb69adc3f9bf82204c608bc28abd5f0b63d5d8162db2d9170a0a68949cc941c897f78869f1a51cfae3d0ad46d70ce059074efcd4663a454e7dc0c07"

RPROVIDES:${PN} += "cmake-Qt6BundledResonanceAudio \
qt6-bundledresonanceaudio-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
