SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python310-robotframework-6.0.1-1.5.noarch.rpm"
RPM_HASH = "b2853a6bb5500b64daae9959bf14b6ae28a423e8b7c1154a17f7ab7636812b529a46da37d4a80a7b708c3766425ffb857e5f049e1aabdb920fe8e60693f6ef9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-robotframework \
python310-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
