SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-dpaa2-20230724-1.1.noarch.rpm"
RPM_HASH = "0c9b965b46c5b73b61afa76072b7d477adf58c3161aaef229c6287a23a2bda7354450a34f695251465bb4763936bc92098f81d2a5121f493511dc4c3934c599d"
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
