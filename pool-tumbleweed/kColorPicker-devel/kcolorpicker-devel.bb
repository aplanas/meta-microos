SUMMARY = "Development files for kColorPicker"
DESCRIPTION = "Development files for kColorPicker including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "kColorPicker-devel-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "74bf12cb07f91b2dc54cae0d832b7dcf4e22d093a8dff05a3099483b85caf76bac8f61c61e5f10946c75b71a96c9cbb78f85cb3b9f4f846e1771509577b4705e"

RPROVIDES:${PN} += "cmake-kColorPicker \
kColorPicker-devel"

RDEPENDS:${PN} += "libkColorPicker0"

inherit rpm
