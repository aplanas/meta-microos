SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python310-Babel-2.12.1-2.1.noarch.rpm"
RPM_HASH = "476e321bd902329e64a20ce4d475ef67332ea3958609fe58a895fb85bfc0848a052dc7b9f798427cce240ab6085f72d09d0c28ce8bdb228a27026210d4ffdd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-babel \
python310-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-pytz"

inherit rpm
