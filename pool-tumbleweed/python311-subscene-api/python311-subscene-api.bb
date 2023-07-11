SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-subscene-api-2.0.0-2.17.noarch.rpm"
RPM_HASH = "51eeea1d7f849d7addb51aca4a5b45eb7818091e9eadb50d7ac0c8644923a7fd32a9addd5c5c62b14dac81bf0eb546c8fc7e0e15c524a99d02158f3915f1a4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subscene-api \
python3.11dist-subscene-api \
python311-subscene-api \
python3dist-subscene-api"

RDEPENDS:${PN} += "python-abi \
python311-beautifulsoup4"

inherit rpm
