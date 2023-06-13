SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "2.21.0"

RPM_NAME = "python39-pre-commit-2.21.0-1.5.noarch.rpm"
RPM_HASH = "e4a23e2eb2eae3a63e116ab9e48e73c496846fb8da5b27d82292ef4702f068ce6315caf97984501a876649a65bbfdc943c994f1ecea995801d5b13180a950b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pre-commit) \
python39-pre-commit \
python3dist(pre-commit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-cfgv \
python39-identify \
python39-nodeenv \
python39-re-assert \
python39-toml \
python39-virtualenv \
update-alternatives"

inherit rpm
