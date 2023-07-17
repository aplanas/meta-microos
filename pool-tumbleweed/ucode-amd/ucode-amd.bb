SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "ucode-amd-20230707-1.1.noarch.rpm"
RPM_HASH = "ea469a5ff579d593858159571d942d968f472c1800dff3fdcdc02e310393253f278bf61e9c0e3c466cc48111cca7af60fa52796d57d40d2654bdb7e14c144a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-amd-ucode/README \
firmware-amd-ucode/microcode-amd-fam15h.bin \
firmware-amd-ucode/microcode-amd-fam16h.bin \
firmware-amd-ucode/microcode-amd-fam17h.bin \
firmware-amd-ucode/microcode-amd-fam19h.bin \
firmware-amd-ucode/microcode-amd.bin \
ucode-amd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch"

inherit rpm
