SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-autopep8-2.0.2-1.4.noarch.rpm"
RPM_HASH = "792ee2d4d0974bc5dc65d226407f92c5196e3738ca9d6bdb001200fd6c24e3b32c51e7c656edf2f0a624dd5a445cca0f499f7e657de3eac55cc71970de1b4039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autopep8 \
python39-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pycodestyle \
python39-tomli \
update-alternatives"

inherit rpm
