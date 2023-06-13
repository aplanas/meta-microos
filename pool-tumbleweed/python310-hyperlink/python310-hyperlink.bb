SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python310-hyperlink-21.0.0-2.1.noarch.rpm"
RPM_HASH = "43103baf178df110d6bfd6ebfe3545ef58388fd30a4e6b3bba6eebdb4f274b18d5b81c7b9635495025b6522234a0ca05dec1c4f9991c6f4bd28d4a3c8e6fee9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperlink \
python3.10dist(hyperlink) \
python310-hyperlink \
python3dist(hyperlink)"

RDEPENDS:${PN} += "python(abi) \
python310-idna"

inherit rpm
