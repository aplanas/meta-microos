SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python311-javapackages-6.1.0-3.2.noarch.rpm"
RPM_HASH = "7a3ead9c6d18d2d6c3abf5b5f368d9c14923a5db09fa7c3ad28aa28457dfc4de52872c9ed88cf94483ddd9c5fd26b135a4764a0fc0d2cc8d3c04d584a22bc2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages \
python3.11dist-javapackages \
python311-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-xml"

inherit rpm
