SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python39-Babel-2.12.1-2.1.noarch.rpm"
RPM_HASH = "98190a8376f335a583fffb69243f081e65d54bf96823cf4e9af9cf7252b9acdfb9abd88cf9c0cfc7fe0d84e4bd48913bcd3d5dd5cc4ea2d3fa480525e894adce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-babel \
python39-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-pytz"

inherit rpm
