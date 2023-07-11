SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-confpy-0.11.0-1.14.noarch.rpm"
RPM_HASH = "4006776c74a5cff0b8a4a576870a4b14a094191a2e7744160765ce4f1e03e174e74655b656e85a553eccbc0daa183685f2e51a53dcdf15d8d5e5f45e4f4515b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-confpy \
python310-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
