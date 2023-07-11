SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python311-pytest-tornado-0.8.1-1.14.noarch.rpm"
RPM_HASH = "58bcbc34c2aa4bca1eab91789f1ea9c324bde85d0226645e1d8ac2b79398470382b47cb8c9cd4c21aacbdc42de1dcc56f037a3c47d34c6b006617dfc3d9e1589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornado \
python3.11dist-pytest-tornado \
python311-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python311-certifi \
python311-pytest \
python311-tornado"

inherit rpm
