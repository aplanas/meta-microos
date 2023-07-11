SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-shutil-1.7.0-7.3.noarch.rpm"
RPM_HASH = "120f32fbde3fd230c534e6e00abda09c86e2c0cccea13c9704e1beeac499a3bd70ac56208dbf09cfcb9f6a62d48e7359980717a79de685bba26104304aff0ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-shutil \
python3.11dist-pytest-shutil \
python311-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python311-execnet \
python311-path \
python311-pytest \
python311-six \
python311-termcolor"

inherit rpm
