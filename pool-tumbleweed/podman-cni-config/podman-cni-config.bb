SUMMARY = "Basic CNI configuration for podman"
DESCRIPTION = "A 'basic' CNI configuration for podman that makes networking usable for basic \
setups. In more complicated setups, users are recommended to write their own \
CNI configurations."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-cni-config-4.5.1-1.2.noarch.rpm"
RPM_HASH = "08a8a79bbb703e327f93b17f2adee257cabdc422d458536910077ba12d087e4fb4bf7798f9ac07d86f96a5a0668cb9752d119412a4a0ce3785b4aaec5b0316b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-cni-config"

RDEPENDS:${PN} += "iproute2 \
podman"

inherit rpm
