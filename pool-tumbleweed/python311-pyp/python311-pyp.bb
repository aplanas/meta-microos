SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pyp-1.1.0-1.3.noarch.rpm"
RPM_HASH = "556a9530b6f0410ba54700f49d7c3b92074c777ea6ffc20c7a7f563e11cfa4acafb2435fc755944021161b3c2ed25e6b3bfb1cff7ccbc8b30bc14e6d347dcf78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypyp) \
python311-pyp \
python3dist(pypyp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-astunparse \
update-alternatives"

inherit rpm
