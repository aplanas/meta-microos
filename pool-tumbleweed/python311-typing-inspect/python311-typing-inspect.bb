SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-typing-inspect-0.8.0-2.3.noarch.rpm"
RPM_HASH = "ab7b5fbff54e2441925931574879888e697655c074af811a486ba2baa4d0a11b71c91cc3412b927a71caee94a686f607ffc0d79c610872c8a36811c40d022f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typing-inspect \
python3.11dist-typing-inspect \
python311-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python311-mypy-extensions \
python311-typing-extensions"

inherit rpm
