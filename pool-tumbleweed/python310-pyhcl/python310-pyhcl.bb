SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python310-pyhcl-0.4.4-2.16.noarch.rpm"
RPM_HASH = "06139c7e9c0c527ba4070441441a6a13cc96fdcb03d6f465d06ed2260b2775ea86241bf9274590c67fa5298d9dcfae3c41d92cbc964d9b442a5b680d7a1313e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyhcl \
python310-pyhcl \
python3dist-pyhcl"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
