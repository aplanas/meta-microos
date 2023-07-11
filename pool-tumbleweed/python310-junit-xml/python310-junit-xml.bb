SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python310-junit-xml-1.9-2.3.noarch.rpm"
RPM_HASH = "54b4d0d6d7f7482c26ff970e24079eaa094b1a6b1a9737629d480b15697cba6cd446e06b4dddf59b2d90f0fd4057bd3d7fc48bf0cd506e3e8f31946a5e795ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-junit-xml \
python310-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
