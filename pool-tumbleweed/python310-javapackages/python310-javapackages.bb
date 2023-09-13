SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "python310-javapackages-6.2.0-2.1.noarch.rpm"
RPM_HASH = "c47364ba66f96adb21bab3845b642b31617409c7ed3d9d1482ff245119e85ed4c4499f4a7d86de9ea382fee92ab07e920e35306323eac253a916d6f1d592efad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-javapackages \
python310-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-xml"

inherit rpm
