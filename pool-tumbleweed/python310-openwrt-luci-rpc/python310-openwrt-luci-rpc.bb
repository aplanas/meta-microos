SUMMARY = "Module for interacting with OpenWrt Luci RPC interface"
DESCRIPTION = "Module for interacting with OpenWrt Luci RPC interface. You need to have 'luci-mod-rpc' \
installed on your openwrt based router. \
 \
-  Allows you to use the Luci RPC interface to fetch connected devices \
   on your OpenWrt based router. \
-  Supports 15.X & 17.X & 18.X or newer releases of OpenWrt. \
 \
https://openwrt-luci-rpc.readthedocs.io"
LICENSE = "Apache-2.0"

PV = "1.1.16"

RPM_NAME = "python310-openwrt-luci-rpc-1.1.16-1.1.noarch.rpm"
RPM_HASH = "0cd410359128f9201a0e9bc4d2a35192ce5ebe2eac9319478f6736025462b91520bec22d4f2d6ae85e696f997ba78fa5c65e729f9be5620c14e08e5e99860690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openwrt-luci-rpc \
python310-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-packaging \
python310-requests"

inherit rpm
