SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-agate-stats-0.4.0-3.4.noarch.rpm"
RPM_HASH = "331854de8d02d400d34b16b369bbccbf991c223c834fe75f5d9d15d1e9d3ad6cb6ae59fdbe142a10d12a92382e3c35d6b434ebdbafd6e38b999b9c8f11b4ad66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-stats \
python310-agate-stats \
python3dist-agate-stats"

RDEPENDS:${PN} += "python-abi \
python310-agate \
python310-six"

inherit rpm
