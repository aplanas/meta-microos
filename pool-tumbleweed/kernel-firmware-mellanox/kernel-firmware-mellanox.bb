SUMMARY = "Kernel firmware files for Mellanox Spectrum switch driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mellanox Spectrum switch driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-mellanox-20230814-1.1.noarch.rpm"
RPM_HASH = "78ec695ffb4b4328caf565afc1228400548cfb99ea70072e588dd8c7a401b967dc794927be0697e624ca376604f01e1cce6952d788af985c71dfd74669ee1427"
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
