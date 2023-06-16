SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-autopep8-2.0.2-1.2.noarch.rpm"
RPM_HASH = "3462af60869a774d18ef66eecc3e6b19542a4d207e93641569e8f0281b0e95c16895157faa609bbd2a5ad3472473ea75fdb851a5567e360362159a3affdcda21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopep8 \
python3.10dist-autopep8 \
python310-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycodestyle \
python310-tomli \
update-alternatives"

inherit rpm
