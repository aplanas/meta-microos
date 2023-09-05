SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-dpaa2-20230829-1.1.noarch.rpm"
RPM_HASH = "28d9fc32ee8d45faf5a00ff166a0bde701ad19fd264666268468d5b3f502b6f96b6a5bccddb0701ae64497353843acab1874a1ec17f4e8cc5c79d3fa75587169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-dpaa2/mc/mc-10.10.0-ls1088a.itb \
firmware-dpaa2/mc/mc-10.10.0-ls2088a.itb \
firmware-dpaa2/mc/mc-10.10.0-lx2160a.itb \
firmware-dpaa2/mc/mc-10.14.3-ls1088a.itb \
firmware-dpaa2/mc/mc-10.14.3-ls2088a.itb \
firmware-dpaa2/mc/mc-10.14.3-lx2160a.itb \
firmware-dpaa2/mc/mc-10.16.2-ls1088a.itb \
firmware-dpaa2/mc/mc-10.16.2-ls2088a.itb \
firmware-dpaa2/mc/mc-10.16.2-lx2160a.itb \
firmware-dpaa2/mc/mc-10.18.0-ls1088a.itb \
firmware-dpaa2/mc/mc-10.18.0-ls2088a.itb \
firmware-dpaa2/mc/mc-10.18.0-lx2160a.itb \
firmware-dpaa2/mc/mc-10.28.1-ls1088a.itb \
firmware-dpaa2/mc/mc-10.28.1-ls2088a.itb \
firmware-dpaa2/mc/mc-10.28.1-lx2160a.itb \
kernel-firmware-dpaa2"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
