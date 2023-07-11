SUMMARY = "oslo.privsep documentation"
DESCRIPTION = "Documentation for oslo.privsep"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python-oslo.privsep-doc-3.0.1-1.4.noarch.rpm"
RPM_HASH = "889dde0721030a475c17b2f60d8e303e1cb04f3a686dc0862bed9bda560dca88f3cbd90fc5d250f15c76486c2abc0b28699e001ce25c09d8f3c2ed270c43f142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.privsep-doc"

RDEPENDS:${PN} += ""

inherit rpm
