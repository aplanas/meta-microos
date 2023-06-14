SUMMARY = "AMDGPU plugin for CRIU"
DESCRIPTION = "This package contains the AMDGPU ROCm support plugin for CRIU."
LICENSE = "GPL-2.0-only"

PV = "3.17.1"

RPM_NAME = "criu-plugin-amdgpu-3.17.1-3.5.aarch64.rpm"
RPM_HASH = "966dbbaaa732dfd9492cf11ddc356d07bfbbc0ef04b914f0f999d72900bbbadbed7a9af8dc4d74fd87b53393cdddbdbe822cb7631a1ce57b7504ef10ad89449d"

RPROVIDES:${PN} += "criu-plugin-amdgpu"

RDEPENDS:${PN} += "criu \
libc.so.6 \
libdrm-amdgpu.so.1"

inherit rpm
