SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-interrogate-1.5.0-1.6.noarch.rpm"
RPM_HASH = "a51dbc4822dc133cfebc59c732ea6ee22e730b2826f4ad7ec5ad826803ee5ba94786b0e1a60aba4677d2b9798f66ddd5bfcbbaca157c2c67e680136d829fbebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-interrogate \
python39-interrogate \
python3dist-interrogate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-click \
python39-colorama \
python39-py \
python39-tabulate \
python39-toml \
update-alternatives"

inherit rpm
