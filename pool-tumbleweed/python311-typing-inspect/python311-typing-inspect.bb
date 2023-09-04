SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-typing-inspect-0.9.0-1.1.noarch.rpm"
RPM_HASH = "2741a19fbf8d15b9da83e34dab633322aad0781147bd5fa2caccccca67fb53085f5c535ee9571e9cfe22d3a2ce993669b543476746bd0b1be107d93b7262670e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typing-inspect \
python3.11dist-typing-inspect \
python311-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python311-mypy-extensions \
python311-typing-extensions"

inherit rpm
