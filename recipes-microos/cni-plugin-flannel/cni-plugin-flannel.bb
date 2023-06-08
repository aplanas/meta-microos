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

RPM_NAME = "cni-plugin-flannel-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "f7baa327ef47483aa9b101b3d85dd4dff14304826393eeb418be3eedf1cfdfa76b42fb6b9cd122257a44c72f3a05c2e6c487659f7f7a826f2fbcd7e7cf2e5e1b"

RPROVIDES:${PN} += "cni-plugin-flannel cni-plugin-flannel(aarch-64)"
RDEPENDS:${PN} += "flannel libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
