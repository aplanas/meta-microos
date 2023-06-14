SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python311-pre-commit-2.21.0-1.5.noarch.rpm"
RPM_HASH = "31ee6f6d91109f618342d1d6e2dcea88ad46582e00b5ae178b6120914dc3a827d1dfe4b3c29edfd3a83c6d2bbb06cc38ec4728a7833f0ca7fdc9f5dfb8ba9f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pre-commit \
python311-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-cfgv \
python311-identify \
python311-nodeenv \
python311-re-assert \
python311-toml \
python311-virtualenv \
update-alternatives"

inherit rpm
