SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python311-subscene-api-2.0.0-2.15.noarch.rpm"
RPM_HASH = "7eb22f76cb17d4ed8fee5690eb46c083534e61ecf992829341339423a87267dbabaa92f05f1c905510905f7a2f83a1c16c15f7433845c53296db2ae893f2c0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(subscene-api) \
python311-subscene-api \
python3dist(subscene-api)"
RDEPENDS:${PN} += "python(abi) \
python311-beautifulsoup4"

inherit rpm
