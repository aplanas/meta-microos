SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-autopep8-2.0.2-1.2.noarch.rpm"
RPM_HASH = "4227a1d0a9d933bf43dda4e5a7c8fcff22605e5b76831a6daaa7db0f5c4fa1b0880e85d47646853273d8c5d3872380be0c57115bed1791610550619b6f2c0333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autopep8) \
python311-autopep8 \
python3dist(autopep8)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-pycodestyle \
update-alternatives"

inherit rpm
