SUMMARY = "Examples and Documents for asciidoc"
DESCRIPTION = "This package contains examples and documents of asciidoc."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-examples-10.2.0-1.4.noarch.rpm"
RPM_HASH = "25fed6baafba188062675cec1be8118aff1b4cc855b6159eaf230dafc2f67e1be1e8d910dc5999ed15db1e0bd2b1921864d4ab51198983140d9f496aef2818a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-examples"
RDEPENDS:${PN} += ""

inherit rpm
