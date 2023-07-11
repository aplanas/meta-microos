SUMMARY = "AMDGPU plugin for CRIU"
DESCRIPTION = "This package contains the AMDGPU ROCm support plugin for CRIU."
LICENSE = "GPL-2.0-only"

PV = "3.18"

RPM_NAME = "criu-plugin-amdgpu-3.18-1.2.aarch64.rpm"
RPM_HASH = "3ba5e88910f3d2de702e5301257d0e03581cbf2f5bfe9cab68401655300d8171142b66e45b9d27bd9e815075419a913419de66c67dc23b05e4b91cc644ad7c86"

RPROVIDES:${PN} += "criu-plugin-amdgpu"

RDEPENDS:${PN} += "criu \
libc.so.6 \
libdrm-amdgpu.so.1"

inherit rpm
