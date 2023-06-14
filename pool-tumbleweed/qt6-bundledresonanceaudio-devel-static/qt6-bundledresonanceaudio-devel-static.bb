SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "16ed68aa7efad16a08df713dbaf1d7b17ffbdaa80adc88058882f4b5e822780e73d6081b7321e58ec190bb2da163de9977ba9c95e66e8f56ec609c60c60af287"

RPROVIDES:${PN} += "cmake-Qt6BundledResonanceAudio \
qt6-bundledresonanceaudio-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
