SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python311-pyhibp-4.2.0-1.5.noarch.rpm"
RPM_HASH = "526086ed1c09f882af0f7d450a9f0b98fb813c59634b14a104269b9312809a337d22d44b3ca90943d24822ae0e4eda9b4b97eca9e9f122fe027376fe7fe656b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhibp \
python3.11dist-pyhibp \
python311-pyhibp \
python3dist-pyhibp"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
