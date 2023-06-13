SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-babelfish-0.6.0-1.8.noarch.rpm"
RPM_HASH = "e002595ae891dd314f3661c0fb19e9a7453d2f2fc69c5a97954c9551cdabd6eac397a5c4ceb819ff69b25c5c40c7ad58effdf2c77434d2a04bb083f594fd5be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-babelfish \
python3.10dist(babelfish) \
python310-babelfish \
python3dist(babelfish)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
