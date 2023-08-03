SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b935f04399a3f77468448628b44cde7700aae2bd6903e0aa29500baf0df74cbfcc4f34d56d06c23fad8a2d5c0280ad71b8a0c9b4a5257c80535716386106b422"

RPROVIDES:${PN} += "cmake-Qt6BundledResonanceAudio \
qt6-bundledresonanceaudio-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
