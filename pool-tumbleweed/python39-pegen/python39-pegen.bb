SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-pegen-0.2.0-1.4.noarch.rpm"
RPM_HASH = "894cbf78520bb683aa41bfc751d11f7e6d7b3156f9a159f2bce277ba54dd5c407ce41d09ff7692dc19b934a990102dc2d71cabdda603e2c91ff5d5c32a3c9d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pegen \
python39-pegen \
python3dist-pegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
