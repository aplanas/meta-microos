SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python310-javapackages-6.1.0-3.2.noarch.rpm"
RPM_HASH = "5174330b583c76a351a143c1d34160c0a9a4b61d6ad758591ed3ae969a326d61ddb8335c12e674c944be06002f4537133f7a90ef4ccc52e07783eba31e96f464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-javapackages \
python310-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-xml"

inherit rpm
