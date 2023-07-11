SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-javadoc-2.5.1-28.6.noarch.rpm"
RPM_HASH = "1ff2d4e85e3e8c1269a85b74b23eb42dad4dcb31e893165b0b3aab9decc1dfdb459618a762fff63e242db7c6193573608d14f57c8c45be22684b790e04a97b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
