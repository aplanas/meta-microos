SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
NXP Management Complex bus driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-dpaa2-20230517-1.1.noarch.rpm"
RPM_HASH = "4f667f15bf0d654d7b58661c6052e3440001f03772638a6a0588a011bf4ee5eccdafbc019637b3b7e8a10260ddc6cfe48f7a21cc123037a6c216f9f7cb74fe7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(dpaa2/mc/mc_10.10.0_ls1088a.itb) \
firmware(dpaa2/mc/mc_10.10.0_ls2088a.itb) \
firmware(dpaa2/mc/mc_10.10.0_lx2160a.itb) \
firmware(dpaa2/mc/mc_10.14.3_ls1088a.itb) \
firmware(dpaa2/mc/mc_10.14.3_ls2088a.itb) \
firmware(dpaa2/mc/mc_10.14.3_lx2160a.itb) \
firmware(dpaa2/mc/mc_10.16.2_ls1088a.itb) \
firmware(dpaa2/mc/mc_10.16.2_ls2088a.itb) \
firmware(dpaa2/mc/mc_10.16.2_lx2160a.itb) \
firmware(dpaa2/mc/mc_10.18.0_ls1088a.itb) \
firmware(dpaa2/mc/mc_10.18.0_ls2088a.itb) \
firmware(dpaa2/mc/mc_10.18.0_lx2160a.itb) \
firmware(dpaa2/mc/mc_10.28.1_ls1088a.itb) \
firmware(dpaa2/mc/mc_10.28.1_ls2088a.itb) \
firmware(dpaa2/mc/mc_10.28.1_lx2160a.itb) \
kernel-firmware-dpaa2"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
