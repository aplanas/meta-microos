SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-case-1.5.3-8.2.noarch.rpm"
RPM_HASH = "2f273c98039292b0d08f19e6e6ec3055105d2424a9c20e272dd3145ea1e165fde1589c203f2a895269bad0a5d6597b1d84f230634dc9410fe5bd45a376b249ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-case \
python3.11dist-case \
python311-case \
python3dist-case"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-setuptools \
python311-six"

inherit rpm
