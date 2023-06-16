SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-flit-3.8.0-5.1.noarch.rpm"
RPM_HASH = "635e786ecffc243ab573e26c8823ce78fd9e58e0c929e68c1cdfd4c347ff371bb166ea4c42b745d3afb5f79145f5ff35e7eafef7e7f8faf91b93461911dd6c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit \
python3.10dist-flit \
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
