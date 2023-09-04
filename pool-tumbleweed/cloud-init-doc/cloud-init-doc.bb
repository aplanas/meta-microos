SUMMARY = "Cloud node initialization tool - Documentation"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node. \
 \
Documentation and examples for cloud-init tools"
LICENSE = "GPL-3.0-only"

PV = "23.1.2"

RPM_NAME = "cloud-init-doc-23.1.2-1.1.aarch64.rpm"
RPM_HASH = "61c8c65bb8d763f130d6a209df8f8a47500cb1a5492016250ccfd9ffa0373a62d988d3f08a51c73032d22198f18d164fd5f089fc6ef9f5de8c5881ffb3780e3b"

RPROVIDES:${PN} += "cloud-init-doc"

RDEPENDS:${PN} += ""

inherit rpm
