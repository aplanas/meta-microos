SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pyp-1.1.0-1.3.noarch.rpm"
RPM_HASH = "a0d4da34a9396a769f4d7b2e3e196acfb52fbf7e4453011e00125227bd7c0f68afb872a390340660eda688f044ff6790ebe9b905c2d508c542a513511d45697f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyp \
python3.10dist-pypyp \
python310-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astunparse \
update-alternatives"

inherit rpm
