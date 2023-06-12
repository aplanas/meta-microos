SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python311-pyhibp-4.2.0-1.3.noarch.rpm"
RPM_HASH = "f9d9e1f5b5b86f335a5a7abf80c640c12c140ed75981bab338fdafe32dbd2cae0cf82623373c255262f3905240ae5d7106534ad4f4a45f8582b87e74d0c02bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyhibp) \
python311-pyhibp \
python3dist(pyhibp)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
