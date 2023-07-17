SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.14.0"

RPM_NAME = "python310-flake8-comprehensions-3.14.0-1.1.noarch.rpm"
RPM_HASH = "e6213a24578398125967cd8e0ceca4b1a3cc7143da9259ccd8ec790bb19d1c7ee3ffa4bb94c6d68989c52f0b73ab30385b577c6d67f69e354b78278f41f98add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-comprehensions \
python310-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
