SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "6ff751d52ca0be2c295dcc52bfd8d6453e4c76da0ffe9b5768a4cff53bc7f39db76a10cbda99bae5e6900720de2b62d970747d726200066c1f32e8056633c024"

RPROVIDES:${PN} += "cmake-Qt6BundledResonanceAudio \
qt6-bundledresonanceaudio-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
