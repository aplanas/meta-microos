SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "ucode-amd-20230829-1.1.noarch.rpm"
RPM_HASH = "0303e6a87396bd75e102d89b7b18a852dd1846cf4e9c32b2d581e62fd6b5c370ae958c918def0a8fd05442c37d558aeb64bd71e22bd13ae84709d3d433973312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-amd-ucode/microcode-amd-fam15h.bin \
firmware-amd-ucode/microcode-amd-fam16h.bin \
firmware-amd-ucode/microcode-amd-fam17h.bin \
firmware-amd-ucode/microcode-amd-fam19h.bin \
firmware-amd-ucode/microcode-amd.bin \
ucode-amd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch"

inherit rpm
