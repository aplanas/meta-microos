SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python311-javapackages-6.1.0-3.1.noarch.rpm"
RPM_HASH = "dd71270c1f66683702c09cb2186b3a337ffcb1dd70db6d26b1ee60230f8ffb4e762cd35700fca7e0d13d9339fa3d203a44cf8ffcb313a0e1ddc0c87586cef113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-javapackages \
python311-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-xml"

inherit rpm
