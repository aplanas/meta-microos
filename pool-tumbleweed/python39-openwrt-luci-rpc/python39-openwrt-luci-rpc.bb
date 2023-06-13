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

RPM_NAME = "python39-openwrt-luci-rpc-1.1.12-2.2.noarch.rpm"
RPM_HASH = "c0de7a50ae8460f0c60b68525330c9de53677b6bf7bee81a3703d9f3269f64687612de541a03fac3055523545ec0d17c8c4e764b9283b97ff97d15f02579f2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openwrt-luci-rpc) \
python39-openwrt-luci-rpc \
python3dist(openwrt-luci-rpc)"

RDEPENDS:${PN} += "python(abi) \
python39-click \
python39-packaging \
python39-requests"

inherit rpm
