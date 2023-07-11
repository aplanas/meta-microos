SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python310-pre-commit-2.21.0-1.7.noarch.rpm"
RPM_HASH = "d08491818e6878cc650d335330f5c63dcc7c7ccd49a6ad60d6b29546ed5e45d9806e00202c31ad7ba5e7aab2bd304e1483accb981d517324bd95127fb17a365e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pre-commit \
python310-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
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
