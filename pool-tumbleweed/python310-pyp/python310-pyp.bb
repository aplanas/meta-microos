SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pyp-1.1.0-1.5.noarch.rpm"
RPM_HASH = "6a47d3eb4c1abbd633e85030626eb241670f18306b19fe6391eb3ea9420f1f0d1ac34277e2b2b2d29020f0cf24658c136025ac818791506234997e22cd3e8bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypyp \
python310-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astunparse \
update-alternatives"

inherit rpm
