SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python311-pytest-tornado-0.8.1-2.1.noarch.rpm"
RPM_HASH = "8e99137eb680f89c509d1adaa2b365f37afc232ab73870c59be079b9e4fefbc0af7af81afb80d55cdddcdfa847dca1399a4ad8be9c737cbaad6c96e349cc1032"
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
