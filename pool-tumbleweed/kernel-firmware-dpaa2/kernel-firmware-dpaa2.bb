SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-dpaa2-20230707-1.1.noarch.rpm"
RPM_HASH = "c03feeb702224f7e5570e7f487ddfef2116f3cc3b3dd16e0aa007d2499512f09d3693028f286cef12811f7c4693519e8d821d1dc0313bc1265da57fb0ae4f955"
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
