SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.13.0"

RPM_NAME = "python311-flake8-comprehensions-3.13.0-1.1.noarch.rpm"
RPM_HASH = "0d95149d507e1e5f35dae0dd7eef88ade4a39cbc619f48a79125c7ff7b83681ba8829acf1ce895a5a1a088bb4acfa4e6eb224807f23006cd0c3c989e1fa0e64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-comprehensions \
python3.11dist-flake8-comprehensions \
python311-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
