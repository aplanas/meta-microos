SUMMARY = "Development files for kColorPicker"
DESCRIPTION = "Development files for kColorPicker including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "kColorPicker-devel-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "6911b9823614812576a7a7b8cee1c4d6c2ac88ebc889b974f9c059b8211dae465ac34c9a8986e3c0a9df36e73aaf22125573cb499216b5affc1e8a1cd82e6bb1"

RPROVIDES:${PN} += "cmake(kColorPicker) \
kColorPicker-devel \
kColorPicker-devel(aarch-64)"

RDEPENDS:${PN} += "libkColorPicker0"

inherit rpm
