SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python311-junit-xml-1.9-2.3.noarch.rpm"
RPM_HASH = "937b4534ed1dc76e8d90dcbfe3b7b8f55822ce2ec2300f29c6f84a2e154953847f4505af275822fc5a03e49e09723050b7b78e12522633c4f6806ab27f9cdd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junit-xml \
python3.11dist-junit-xml \
python311-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
