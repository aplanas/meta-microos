SUMMARY = "Kernel firmware files for Mellanox Spectrum switch driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mellanox Spectrum switch driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-mellanox-20230517-1.1.noarch.rpm"
RPM_HASH = "e3ca62c6204648077d4cba4a5ee3d11e0bd84aa8f1b72ba3110fdbb1fb0358f270b73beff298bd2be57d4a39402d40e06d2de693570825db9777e7e58d5b3715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mellanox/lc_ini_bundle_2010_1006.bin) \
firmware(mellanox/lc_ini_bundle_2010_1502.bin) \
firmware(mellanox/lc_ini_bundle_2010_3020.bin) \
firmware(mellanox/lc_ini_bundle_2010_3146.bin) \
firmware(mellanox/mlxsw_spectrum-13.1420.122.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.1530.152.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.1620.192.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.1702.6.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.1703.4.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.1910.622.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2000.1122.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2000.1886.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2000.2308.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2000.2714.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2007.1168.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.1036.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.1310.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.1312.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.2018.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.2304.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.2406.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.2438.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.2946.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2008.3326.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.1006.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.1232.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.1406.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.1502.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.3020.mfa2) \
firmware(mellanox/mlxsw_spectrum-13.2010.3146.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2000.2308.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2000.2714.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2007.1168.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.1036.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.1310.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.1312.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.2018.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.2304.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.2406.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.2438.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.2946.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2008.3326.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.1006.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.1232.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.1406.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.1502.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.3020.mfa2) \
firmware(mellanox/mlxsw_spectrum2-29.2010.3146.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2007.1168.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.1036.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.1310.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.1312.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.2018.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.2304.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.2406.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.2438.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.2946.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2008.3326.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.1006.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.1232.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.1406.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.1502.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.3020.mfa2) \
firmware(mellanox/mlxsw_spectrum3-30.2010.3146.mfa2) \
kernel-firmware-mellanox"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
