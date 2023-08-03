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

RPM_NAME = "python311-openwrt-luci-rpc-1.1.16-1.1.noarch.rpm"
RPM_HASH = "bcdf70209869f61cd47ace21a7fa367aca3c7e1a2de0ecb456bbabe7d001d6f8f314f0663d97b891efc7d1eb657e7cba5bde46ad7800817e7643d1442052984f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openwrt-luci-rpc \
python3.11dist-openwrt-luci-rpc \
python311-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-packaging \
python311-requests"

inherit rpm
