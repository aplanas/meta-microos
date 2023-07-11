SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python39-robotframework-6.0.1-1.5.noarch.rpm"
RPM_HASH = "9b1aa961a73379fd419fcafb6cca33d53bd3a0d3a28cc352b178d5723cdb51e0635f0fbff9565e6555bde308d5f095e5589a63e14d716f8608b7628004766303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-robotframework \
python39-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
