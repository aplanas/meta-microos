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

RPM_NAME = "python310-openwrt-luci-rpc-1.1.12-2.2.noarch.rpm"
RPM_HASH = "e9e665dac178503f6ccbec041181db07768c1207d1d6c79fe5ba32315a7b8e328deb9dac7dcd99ce692a50863ee159385ee23d8b5477e77f834864a047523950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openwrt-luci-rpc \
python3.10dist-openwrt-luci-rpc \
python310-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-packaging \
python310-requests"

inherit rpm
