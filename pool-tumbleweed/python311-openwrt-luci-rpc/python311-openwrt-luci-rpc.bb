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

RPM_NAME = "python311-openwrt-luci-rpc-1.1.12-2.4.noarch.rpm"
RPM_HASH = "822c0c47a16be92afb55bb5b721dc63c2af933f65e60d6c50cb7104367e0e06eae3b121d72178c55c80bb963f6b3964cf4e75b02b9ef1eaaf48adbc9d0aff7f5"
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
