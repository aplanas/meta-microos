SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python310-pre-commit-2.21.0-1.5.noarch.rpm"
RPM_HASH = "cfc952a8b66baf0be58d17772032e22edd71f59bde7412b92b54e059989ea6cfe09f21e9de29da7b496b47a490576286e0059e47f10ef982c4aea06040a6b8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pre-commit \
python3.10dist-pre-commit \
python310-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3.10 \
python-abi \
python310-PyYAML \
python310-cfgv \
python310-identify \
python310-nodeenv \
python310-re-assert \
python310-toml \
python310-virtualenv \
update-alternatives"

inherit rpm
