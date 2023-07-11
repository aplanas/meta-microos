SUMMARY = "Documentation for Lmod"
DESCRIPTION = "Documentation (pdf) for the Lmod Environment Modules System."
LICENSE = "MIT"

PV = "8.7.17"

RPM_NAME = "lua-lmod-doc-8.7.17-3.1.noarch.rpm"
RPM_HASH = "f7251376fa5a100441f580724b66c41539696f04c1b7c70817922438075dc4e2277f863ccdbdf0a8991671a4e81224c71d70279dd44ca3ed3231ccf765043ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lmod-doc"

RDEPENDS:${PN} += ""

inherit rpm
