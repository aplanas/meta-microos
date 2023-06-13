SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python311-robotframework-6.0.1-1.4.noarch.rpm"
RPM_HASH = "89650e32fb1ddd5aa3ec8c2a08ab44e6d889df8663d14074714fe3ccf4f91ec754f5c87dc3634728bb58bebda2733bbe0394eb8f30471b8fddd275138d35ee80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(robotframework) \
python311-robotframework \
python3dist(robotframework)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
