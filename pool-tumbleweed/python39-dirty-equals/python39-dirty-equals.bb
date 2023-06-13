SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-dirty-equals-0.5.0-1.3.noarch.rpm"
RPM_HASH = "e1f18b28f7c1fd6a2ade8b6497756c8f48ec2ae48510beb514e917154d4206f710641a6b4ffca3a3a12055b3b67788ecfd7c61adc0c1198068c081fd09b51cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dirty-equals) \
python39-dirty-equals \
python3dist(dirty-equals)"

RDEPENDS:${PN} += "python(abi) \
python39-pytz"

inherit rpm
