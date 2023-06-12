SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.12.0"

RPM_NAME = "python311-flake8-comprehensions-3.12.0-2.1.noarch.rpm"
RPM_HASH = "136c73907b030d3fd2c32a16c12b01ebb441fa96d8a3b95bbda33f7fac558a6275847d7cd1058699cb4e60bba3bc2fb361d0c2a02027a401d2fb200d847d6b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-comprehensions) \
python311-flake8-comprehensions \
python3dist(flake8-comprehensions)"
RDEPENDS:${PN} += "python(abi) \
python311-flake8"

inherit rpm
