SUMMARY = "Cloud node initialization tool - Documentation"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node. \
 \
Documentation and examples for cloud-init tools"
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-doc-23.1-2.1.aarch64.rpm"
RPM_HASH = "bf9acfa6fc4fcdbc27bfd4c20b3b6e340c6d9768c6c80b9641d01cdbcdfa665dfeb2fa982afdf21035a29d5ab270a59b05ec6c17e6eded108a931fdfaf4d7e4c"

RPROVIDES:${PN} += "cloud-init-doc"

RDEPENDS:${PN} += ""

inherit rpm
