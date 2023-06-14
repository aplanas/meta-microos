SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-dpaa2-20230517-1.1.noarch.rpm"
RPM_HASH = "4f667f15bf0d654d7b58661c6052e3440001f03772638a6a0588a011bf4ee5eccdafbc019637b3b7e8a10260ddc6cfe48f7a21cc123037a6c216f9f7cb74fe7c"
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

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
