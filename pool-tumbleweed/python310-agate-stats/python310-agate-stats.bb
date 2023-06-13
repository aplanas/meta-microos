SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-agate-stats-0.4.0-3.2.noarch.rpm"
RPM_HASH = "20a14cb5769d158678a9163490df5d74037a3c7b8274a7e536290ebcf1f344314476f2195f1322208029d3698b9423d8ac519b63a55e5a007e2b6d73cd07cc1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-stats \
python3.10dist(agate-stats) \
python310-agate-stats \
python3dist(agate-stats)"

RDEPENDS:${PN} += "python(abi) \
python310-agate \
python310-six"

inherit rpm
