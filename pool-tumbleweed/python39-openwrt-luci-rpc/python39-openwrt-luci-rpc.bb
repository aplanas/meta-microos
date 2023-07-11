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

PV = "1.1.12"

RPM_NAME = "python39-openwrt-luci-rpc-1.1.12-2.4.noarch.rpm"
RPM_HASH = "d2b3b0168e2c91d1179e3274feea0085e3e320902725bbbd0584f55d8c40689019a210edea65ea8c7df562eecece5beacb28548dd01bf053860715b7b6aa72ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openwrt-luci-rpc \
python39-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-packaging \
python39-requests"

inherit rpm
