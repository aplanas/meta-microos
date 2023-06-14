SUMMARY = "Cloud node initialization tool - Documentation"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node. \
 \
Documentation and examples for cloud-init tools"
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-doc-23.1-1.3.aarch64.rpm"
RPM_HASH = "f5bea75dffe2a1fe004974e0666117bc8a0f1285868b324407bfe381e6da035c93eb43cbfca24ebf980f05e03ded53e05159ab8ed667acf2cc0498ee0eaffd30"

RPROVIDES:${PN} += "cloud-init-doc"

RDEPENDS:${PN} += ""

inherit rpm
