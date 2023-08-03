SUMMARY = "Kernel firmware files for Mellanox Spectrum switch driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mellanox Spectrum switch driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-mellanox-20230724-1.1.noarch.rpm"
RPM_HASH = "63658d03cc8f1c5ba857542eaa2775133bbd6bffeb82db08e9258e3509fe504d516f05f908c5974ae9449ffd095546b9704fb19181bff0370a019d033f5604ce"
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
kernel-firmware-mellanox"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
