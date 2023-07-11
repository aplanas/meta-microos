SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python310-Babel-2.12.1-1.3.noarch.rpm"
RPM_HASH = "1b16490d6542b42ca4be9385fdcc0740cff0ffecc4cde26ab6def627773056c1a957da71466eed66632a333a09b84b563cafe3f818cb99b51c133cd45f289547"
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
