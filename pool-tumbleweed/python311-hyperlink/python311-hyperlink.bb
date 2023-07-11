SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python311-hyperlink-21.0.0-2.3.noarch.rpm"
RPM_HASH = "21934d25fffb25e69094d2a657de8d0faaf0548e63ab94493dd65ed58cf8e01fa2f8b781a5b4a3a247093ba20c31218071a475cf517ddfe75b700f22f93d310c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperlink \
python3.11dist-hyperlink \
python311-hyperlink \
python3dist-hyperlink"

RDEPENDS:${PN} += "python-abi \
python311-idna"

inherit rpm
