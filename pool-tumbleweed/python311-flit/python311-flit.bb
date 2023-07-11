SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-flit-3.8.0-5.3.noarch.rpm"
RPM_HASH = "a6f7c65431684f59382b57cb4f4e5f4e61390e07344fb47271cef0f8d35f80bdb8972962a0f826d58578a9220ce335ec8bdcbbb1187dd143c5e03212456134b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit \
python3.11dist-flit \
python311-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-flit-core \
python311-requests \
python311-tomli-w \
update-alternatives"

inherit rpm
