SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python39-beartype-0.15.0-1.1.noarch.rpm"
RPM_HASH = "8364ca7f1ce7e678ee700580eaf441ced8f0ce8f8518e5b8fdcb14a089455651da5ca76ef6088900eb90e75320710fdd236a0ac094217b3c7b904b99ca767ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beartype \
python39-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
