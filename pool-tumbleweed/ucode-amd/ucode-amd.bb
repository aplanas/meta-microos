SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "ucode-amd-20230620-1.1.noarch.rpm"
RPM_HASH = "792c156f91a4d9c2ef60440f3aa93848c6045143d3a37c30ef6e1a5563361d2dbd5e93dacd8b4d092561a060eaa4386677ad753c65b88bc218599e1bfbae1899"
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
