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

RPM_NAME = "python310-openwrt-luci-rpc-1.1.12-2.4.noarch.rpm"
RPM_HASH = "2336458e041084484244a3fb06c7aa7d6637371fa76b62e2baa3d6dcb2ea50e06d9f85b0ac280f88fa46a461ada0633fbeb483d09a05be1e82fa4474a7bd1e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openwrt-luci-rpc \
python310-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-packaging \
python310-requests"

inherit rpm
