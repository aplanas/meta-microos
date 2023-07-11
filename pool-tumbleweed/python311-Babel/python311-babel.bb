SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python311-Babel-2.12.1-1.3.noarch.rpm"
RPM_HASH = "63d4351dfb6fd89a8f3538e2136fed0037c6f2ae3d071539ceb251b45a1d9356c51f421f7955d825738ea64279fb43633570f57cff3d4e236fb038aebc2219b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Babel \
python3-babel \
python3.11dist-babel \
python311-Babel \
python3dist-babel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-pytz"

inherit rpm
