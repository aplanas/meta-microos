SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python310-mechanize-0.4.8-5.2.noarch.rpm"
RPM_HASH = "a01dba55632c94b2bffcc5a8581cd06db64b17fe4859a37d0bb91f3b9f3b84f9a4131da2d76a59ffc736407516b7e30158af0f458cd354ea5d8a7b5830c9defa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mechanize \
python3.10dist-mechanize \
python310-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python310-html5lib"

inherit rpm
