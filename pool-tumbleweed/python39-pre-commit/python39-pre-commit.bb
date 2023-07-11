SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python39-pre-commit-2.21.0-1.7.noarch.rpm"
RPM_HASH = "29536c2070c12f38d8ab0a774cd35addc317f8cbb8e6cb8483a2da868d4a62d3678a4dc9e49157c5dec3e5aa2d79460190454cf713398d937343603aeaaca967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pre-commit \
python39-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-cfgv \
python39-identify \
python39-nodeenv \
python39-re-assert \
python39-toml \
python39-virtualenv \
update-alternatives"

inherit rpm
