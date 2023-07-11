SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python310-hyperlink-21.0.0-2.3.noarch.rpm"
RPM_HASH = "ec4328cba127d2a70bf4c01fa713aa2d88032f1b4cbb0bc92502b075008d4d5d143f718b0f940ad1ac6776a0c4e88afb45674ad1fe98153bf14dbe3b88ce97e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hyperlink \
python310-hyperlink \
python3dist-hyperlink"

RDEPENDS:${PN} += "python-abi \
python310-idna"

inherit rpm
