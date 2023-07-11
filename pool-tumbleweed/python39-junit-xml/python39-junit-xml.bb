SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python39-junit-xml-1.9-2.3.noarch.rpm"
RPM_HASH = "604ed6dddedb73acde4d1376a1b7b354fe99cf02ea5f584cff7472fd3645fe56f94b05080969faf0b1ef3cd19102ba6eeae7887205ac7f65217025e0becc4991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-junit-xml \
python39-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
