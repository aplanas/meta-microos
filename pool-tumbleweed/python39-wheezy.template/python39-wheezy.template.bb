SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-wheezy.template-3.1.0-1.2.noarch.rpm"
RPM_HASH = "4b7816d09740ab2d3061b7ff474d5d1736a1d74e523307ceb1a27fc60eff8e12d49289644ce74b34803492451b16f7884254ed69c98aa88d713a4ea3556f89c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wheezy.template \
python39-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
