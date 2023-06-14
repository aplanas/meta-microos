SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python39-junit-xml-1.9-1.13.noarch.rpm"
RPM_HASH = "0ef931c7427d1a267d45fc023da27ae373bc2772f212cf466e1d76c56501c6f813d5d4aea578e389797cf9a867b18c05032650e80f93379e0ad24ecc6cc714aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-junit-xml \
python39-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
