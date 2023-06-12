SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python310-pyhibp-4.2.0-1.3.noarch.rpm"
RPM_HASH = "15ee278df3ce49fedc6576a25e7cdcf58f37897969d8b05ed0a477005742f288032f20a48969df15c0a72ac96ffaad3146bc52fc425642f0a9cdaadffa9dbe7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhibp \
python3.10dist(pyhibp) \
python310-pyhibp \
python3dist(pyhibp)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
