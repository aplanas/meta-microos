SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python39-robotframework-6.0.1-1.4.noarch.rpm"
RPM_HASH = "cf130b2f3cc92910aaead5853e9cae35d31d761e25de81c11ebd741ce29120a42b20a7129914ea003a73df7c0b16925d7ef0f2a3e65d8f4fc6577d722d2aeaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-robotframework \
python39-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
