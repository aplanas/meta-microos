SUMMARY = "Developer documentation for libfontconfig"
DESCRIPTION = "HTML documentation and manual pages for developers using the \
fontconfig library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-devel-doc-2.14.2-1.4.noarch.rpm"
RPM_HASH = "417d9922b6fd00f08de4718beef873c2d75fb72c86fcde3b26d0366bae030ffdbb7c786a4898ac7337e04dbe0f65705858224c41ec8a315755fe39d446160b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
