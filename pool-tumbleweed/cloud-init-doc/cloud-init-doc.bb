SUMMARY = "Cloud node initialization tool - Documentation"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node. \
 \
Documentation and examples for cloud-init tools"
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-doc-23.1-1.4.aarch64.rpm"
RPM_HASH = "a17c30bbcda54b961ff16beb9ee05eb5f380c8f6f6890cb61e6d43161edac01614b56da36edaabc353106659a699b3152e52988a267facb0b2b912285f7651ab"

RPROVIDES:${PN} += "cloud-init-doc"

RDEPENDS:${PN} += ""

inherit rpm
