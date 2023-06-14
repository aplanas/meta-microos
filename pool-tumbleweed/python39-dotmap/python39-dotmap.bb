SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python39-dotmap-1.3.30-1.3.noarch.rpm"
RPM_HASH = "98dd7fde06307f97555eb034165f986dea0e28509432d4694d9bbbaafe93e0b7e3b25d4e111f15b4789dc11bb745821a5ed0eba03e2606389709f0afa3dd2e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dotmap \
python39-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
