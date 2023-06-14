SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-flit-3.8.0-5.1.noarch.rpm"
RPM_HASH = "83d795a9a73f077e68ccc27826460ddd2dcf0536823040f36f7ed7bfa5d05b033b29a89705c43ece304254338452bf4885bf452cbf5b916aa6411fb41a0d8e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit \
python39-flit \
python3dist-flit"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-docutils \
python39-flit-core \
python39-requests \
python39-tomli-w \
update-alternatives"

inherit rpm
