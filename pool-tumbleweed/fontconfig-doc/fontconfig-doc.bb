SUMMARY = "Documentation for fontconfig"
DESCRIPTION = "Extended documentation for the fontconfig library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-doc-2.14.2-1.4.noarch.rpm"
RPM_HASH = "c998bd8546551c31146cc0fbd1d40e09f2c53cdee1fa53eb17b25356db709268e995e3c3202a1d3716fe5d2bac285123ae5a21235c42ee5b70988b94310b530f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
