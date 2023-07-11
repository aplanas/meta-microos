SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python310-pyhibp-4.2.0-1.5.noarch.rpm"
RPM_HASH = "5e0e82e2aa0a5867bbd0b47a41c02c8fe7a1d28bda57c04785a893c2941bdbe51f853f9dd7600d42f7a331bfb6e225fbc5f5f1053d384286412466b0c0c03ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyhibp \
python310-pyhibp \
python3dist-pyhibp"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
