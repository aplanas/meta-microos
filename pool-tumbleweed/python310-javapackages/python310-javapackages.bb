SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python310-javapackages-6.1.0-4.1.noarch.rpm"
RPM_HASH = "1a42169f70fe82d1fe412e669e9bc830137d8b00aabf023efc8922371a4f44fa66415fbc72e906ad91390dcc0a7e30b090f45296c62dd03be92678b531ede6d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-javapackages \
python310-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-xml"

inherit rpm
