SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20230810.a7534f6"

RPM_NAME = "openSUSE-repos-Tumbleweed-NVIDIA-20230810.a7534f6-1.1.aarch64.rpm"
RPM_HASH = "23ba6080eac0519989ff333058e2aa5ae980f4fd0380d8d1ea5079ca1f5c25e255ae0038fceec6c16a018501892af37375f98e1334aa1d76dba7277fdc3c0584"

RPROVIDES:${PN} += "openSUSE-repos-NVIDIA \
openSUSE-repos-Tumbleweed-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos"

inherit rpm
