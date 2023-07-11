SUMMARY = "Userspace interface to kernel DRM services for Nvidia Tegra chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Nvidia Tegra chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_tegra0-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "b77e71503e912a423592eb8436b8fc70295edcd9bdf670e8d4549e97cb4a45b45316c9ec1b5e74059eff383890e0b6855238bae421cad5d152b76718484c7102"

RPROVIDES:${PN} += "libdrm-tegra.so.0 \
libdrm-tegra0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
