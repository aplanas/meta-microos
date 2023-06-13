SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python310-javapackages-6.1.0-3.1.noarch.rpm"
RPM_HASH = "8f5cba484b88a2ae8dd81f8fda67afc1b89b1b7545385f2b794a11953260cab273bd2a7724323af4ce0e3cfadc87c8872231e3bef116739f15191accc9539465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages \
python3.10dist(javapackages) \
python310-javapackages \
python3dist(javapackages)"

RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-xml"

inherit rpm
