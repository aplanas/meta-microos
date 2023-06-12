SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python311-junit-xml-1.9-1.13.noarch.rpm"
RPM_HASH = "0bf87cc9dc886bc4c018bed6a2b4a1c0c31949a8cd785c8fc330d7fbf3963d27623fcf7d369e2c121836c641f020d0972d21b12a9fb0c055439bbfe6d65256ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(junit-xml) \
python311-junit-xml \
python3dist(junit-xml)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
