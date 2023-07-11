SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-subscene-api-2.0.0-2.17.noarch.rpm"
RPM_HASH = "5482b13e7c0b367d53903a8d586b3d846f15fc3b4a554a476e8655b743c0f6d797ea9222171e40603e92ac289b4aaeb930ea10c622b26957e51fc2ea87b9c024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subscene-api \
python310-subscene-api \
python3dist-subscene-api"

RDEPENDS:${PN} += "python-abi \
python310-beautifulsoup4"

inherit rpm
