SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20230810.a7534f6"

RPM_NAME = "openSUSE-repos-MicroOS-NVIDIA-20230810.a7534f6-1.1.aarch64.rpm"
RPM_HASH = "7d35de575a9efd6250f26d5a33e7c91bfd4368f26a306c3ef7770c1304ab309161c3c61a36b7c6696999b0c3376f5166265e381153feb2cd30f40743c3722eac"

RPROVIDES:${PN} += "openSUSE-repos-MicroOS-NVIDIA \
openSUSE-repos-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos"

inherit rpm
