SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python310-pydash-5.1.0-1.6.noarch.rpm"
RPM_HASH = "2b30edb1731251dcdbbddabc71fc75c498a92b42d27489c13fbc9c69c85724ac925a3ea427181122c7bcc55d807fc20806676da8fe524ada6fb8c400fa2c5be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydash \
python3.10dist(pydash) \
python310-pydash \
python3dist(pydash)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
