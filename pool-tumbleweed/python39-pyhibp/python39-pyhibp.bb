SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python39-pyhibp-4.2.0-1.3.noarch.rpm"
RPM_HASH = "2e37ce24bf893a312de5cf6f7fd87427b9af65e186d20e39f5d77284e5d2c9a612e8390b3caaf896702278dc71a17debbd1183513e2e669e418215cba58ece71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyhibp) \
python39-pyhibp \
python3dist(pyhibp)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
