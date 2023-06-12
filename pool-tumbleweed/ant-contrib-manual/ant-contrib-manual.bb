SUMMARY = "Manual for ant-contrib"
DESCRIPTION = "Documentation for ant-contrib tasks."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-manual-1.0b3-10.3.noarch.rpm"
RPM_HASH = "f392e0fa113f0040fd34574df4f5aeb44a7a04077e6f2fd66cc40f369c67d4f2476e8f145ce8d196e533d021869a724b4f5a69d199131b46cb081aa46cb17b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-manual"
RDEPENDS:${PN} += ""

inherit rpm
