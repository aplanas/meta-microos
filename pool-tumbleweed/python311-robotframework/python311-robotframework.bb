SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python311-robotframework-6.0.1-1.5.noarch.rpm"
RPM_HASH = "12fb32618024e1598029738a3cf12ce961651de6438d10776ba495dc5852c111904196f60137e6d701d9c78670c4054abd42794b200ea848d581515516932b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robotframework \
python3.11dist-robotframework \
python311-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
