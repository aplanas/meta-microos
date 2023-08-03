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

RPM_NAME = "python39-openwrt-luci-rpc-1.1.16-1.1.noarch.rpm"
RPM_HASH = "3350e09381339f080df7e14a256a2588e7523c4affc343527934b51e5deaac1f852e24150869ca918dc314da0120309eb999df7fd342edc38cfa53384d8e0c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openwrt-luci-rpc \
python39-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-packaging \
python39-requests"

inherit rpm
