SUMMARY = "Framework which connects a genders database to dnsmasq"
DESCRIPTION = "This framework feeds dnsmasq with the node information of a genders \
database. It can also create a PXE boot file structure with the possiblity to \
update node MAC addresses in the genders database. In addition, boot images \
can be managed in the PXE environment."
LICENSE = "BSD-3-Clause"

PV = "0.0.6"

RPM_NAME = "clustduct-0.0.6-2.8.aarch64.rpm"
RPM_HASH = "fc6f8e8c7c41d4845bd3dde31f4b522f471847d500c2152116d5772190c0bc029b29564d7835f70767c55a4ff69b71953f9863329d4d3d2a46c5f448a15e5701"

RPROVIDES:${PN} += "clustduct \
clustduct(aarch-64) \
config(clustduct)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/lua \
bc \
dnsmasq \
dolly \
genders \
lua-genders"

inherit rpm
