SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "python311-javapackages-6.2.0-2.1.noarch.rpm"
RPM_HASH = "b855c6eda68e732d8e1656aaa02fe74eb85cd2d35a99a625f352d9b8218945be2b5834b4a50eb9532be92094d87f1df8ff89411e72358c81b610b4a3caafde52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages \
python3.11dist-javapackages \
python311-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-xml"

inherit rpm
