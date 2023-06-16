SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pyp-1.1.0-1.3.noarch.rpm"
RPM_HASH = "550fe589003a9bc39bcca04bd1dbb58b618581a4d6e8cd897b1d92b2d189073d57aef8f446734fe980b1a096731418d158fbfba990a0c8d4bdb37b5d5ae9627d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypyp \
python39-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astunparse \
update-alternatives"

inherit rpm
