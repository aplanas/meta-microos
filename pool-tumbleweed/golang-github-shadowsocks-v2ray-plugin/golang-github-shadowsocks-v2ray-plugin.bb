SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray \
 \
This package provide source code for shadowsocks-v2ray-plugin"
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "golang-github-shadowsocks-v2ray-plugin-1.3.2-1.1.noarch.rpm"
RPM_HASH = "591d4f85bf24249d18474c46cca80360a7ff5778ecb1f82d1a92c931d3170015920ddfe6a83ebb0d86e87ea51eef31e08a4e267be174de34a79c145507341f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-shadowsocks-v2ray-plugin"

RDEPENDS:${PN} += "golang-github-v2fly-v2ray-core"

inherit rpm
