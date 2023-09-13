SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python310-flit-3.9.0-1.1.noarch.rpm"
RPM_HASH = "6e3bfacdeb271746070c6b301a61a3a8297729d4a8105502647c0b0604a5156f29e5105912bf9e36a893bf21aa13c78552560f1302f6c6508cd23e853c28032f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit \
python310-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-flit-core \
python310-requests \
python310-tomli-w \
update-alternatives"

inherit rpm
