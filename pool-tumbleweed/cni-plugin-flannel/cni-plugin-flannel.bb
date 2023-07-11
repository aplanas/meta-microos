SUMMARY = "A CNI network plugin that is powered by flannel"
DESCRIPTION = "This plugin is designed to work in conjunction with flannel, a network fabric \
for containers. When flannel daemon is started, it outputs a \
/run/flannel/subnet.env file that looks like this: \
 \
FLANNEL_NETWORK=10.1.0.0/16 \
FLANNEL_SUBNET=10.1.17.1/24 \
FLANNEL_MTU=1472 \
FLANNEL_IPMASQ=true \
 \
This information reflects the attributes of flannel network on the host. The \
flannel CNI plugin uses this information to configure another CNI plugin, such \
as bridge plugin."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "cni-plugin-flannel-1.0.1-1.10.aarch64.rpm"
RPM_HASH = "3f2f5d9c03a424a639b153754f298987c187f86d9a42369e8325c4d7918c8dd87eb85349c9bb684d5855a70e115b48f6922f5acdb868752b9956d3c20f890269"

RPROVIDES:${PN} += "cni-plugin-flannel"

RDEPENDS:${PN} += "flannel \
libc.so.6"

inherit rpm
