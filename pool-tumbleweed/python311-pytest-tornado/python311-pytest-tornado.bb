SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python311-pytest-tornado-0.8.1-1.12.noarch.rpm"
RPM_HASH = "dff9e4adf3f4aa097b94ddfc4512a3285ea9198da782faf315b895c04f8cb3e06145d0684e53266522fbdaf151608569e6c5325552dc543a071925bf32d22e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-tornado) \
python311-pytest-tornado \
python3dist(pytest-tornado)"

RDEPENDS:${PN} += "python(abi) \
python311-certifi \
python311-pytest \
python311-tornado"

inherit rpm
