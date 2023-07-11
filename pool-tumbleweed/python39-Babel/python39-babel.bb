SUMMARY = "Internationalization utilities"
DESCRIPTION = "A collection of tools for internationalizing Python applications."
LICENSE = "BSD-3-Clause"

PV = "2.12.1"

RPM_NAME = "python39-Babel-2.12.1-1.3.noarch.rpm"
RPM_HASH = "bd6354ac3817db0c66e2a4f31da0067e1aa7ca49d4df8b1325dd57a41c02a0d1dd4fa6f7c6518c045a910b76089445034639774ea879a8d3aff38957d5ab3788"
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
