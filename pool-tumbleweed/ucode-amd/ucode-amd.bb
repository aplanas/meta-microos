SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "ucode-amd-20230814-1.1.noarch.rpm"
RPM_HASH = "3f0889e2bf1bd98e792a9d471abf475c42e54f4d90532ff6537e67675e826a47bec2db4a51cfee971f5b7a58b29145ba3bd7bcd1c8c6c53e600f026541b68b13"
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
