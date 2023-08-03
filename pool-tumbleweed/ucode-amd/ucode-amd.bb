SUMMARY = "Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains the microcode files used by AMD CPUs."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "ucode-amd-20230724-1.1.noarch.rpm"
RPM_HASH = "ed32ab85f09ec57d618ac4e6ebbec20cdea85c5e9c6b8230605c4704ae84b53a5d93148da51b619b637f1b1a1fc72921318fbbf8858f338459a2471453218ca7"
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
