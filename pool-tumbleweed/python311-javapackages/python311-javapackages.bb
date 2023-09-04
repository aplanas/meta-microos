SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python311-javapackages-6.1.0-4.1.noarch.rpm"
RPM_HASH = "f9577936ffc6bda77547a284b6de1a3bb8238d7eee15464d81999daf4aac742e2d0e905f74accfcf51d25462061e91b9b56e5f0af87b200cc1b9ef732d142932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages \
python3.11dist-javapackages \
python311-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-xml"

inherit rpm
