SUMMARY = "Kernel firmware files for Mellanox Spectrum switch driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mellanox Spectrum switch driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-mellanox-20230829-1.1.noarch.rpm"
RPM_HASH = "a004c33d6192e88e04003ed52e79c5ceca14de0142f0ebff86e2abbda2b4f0ae023f6dd4f996af046076b3b521bbda7c5a171501558fc3a88ec52ef2d102042d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mellanox/lc-ini-bundle-2010-1006.bin \
firmware-mellanox/lc-ini-bundle-2010-1502.bin \
firmware-mellanox/lc-ini-bundle-2010-3020.bin \
firmware-mellanox/lc-ini-bundle-2010-3146.bin \
firmware-mellanox/mlxsw-spectrum-13.1420.122.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1530.152.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1620.192.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1702.6.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1703.4.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1910.622.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.1122.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.1886.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.2308.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.2714.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2000.2308.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2000.2714.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum4-34.2012.1012.mfa2 \
kernel-firmware-mellanox"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
