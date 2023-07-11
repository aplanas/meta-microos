SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.13.0"

RPM_NAME = "python310-flake8-comprehensions-3.13.0-1.1.noarch.rpm"
RPM_HASH = "da53ce1ce97e9c44efc621dd3073705d34ee77720618d9b635de0916b16fba06714437e28b37dace9e291e512066181f83555bf0aa3f6e0c0e51a32c94e775ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-comprehensions \
python310-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
