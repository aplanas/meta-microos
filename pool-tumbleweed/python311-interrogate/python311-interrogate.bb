SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-interrogate-1.5.0-1.4.noarch.rpm"
RPM_HASH = "36da6b0bb9d0bd774cf9ba4896a399e9b5e11833446b378836491043c29404f9a452a71facb4658267a0036259eed80d180b0a18230ac75302317b95a6748f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(interrogate) \
python311-interrogate \
python3dist(interrogate)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-attrs \
python311-click \
python311-colorama \
python311-py \
python311-tabulate \
python311-toml \
update-alternatives"

inherit rpm
