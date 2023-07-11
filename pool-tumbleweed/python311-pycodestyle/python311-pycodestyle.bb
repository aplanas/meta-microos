SUMMARY = "Python style guide checker"
DESCRIPTION = "pycodestyle is a tool to check your Python code against some of the style \
conventions in `PEP 8`. \
 \
This package used to be called ``pep8`` but was renamed to ``pycodestyle`` \
to reduce confusion."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python311-pycodestyle-2.10.0-5.3.noarch.rpm"
RPM_HASH = "9f64461002f63958b23e3b762c6eef2a609bc2aec2d9f4d2770a6783363b4d6f58d446dc4f9bf17b4c6c8b119533984e2df08b53a7e4fb5351c6c9cd2742bc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8 \
python3-pycodestyle \
python3.11dist-pycodestyle \
python311-pep8 \
python311-pycodestyle \
python3dist-pycodestyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
