SUMMARY = "Documentation for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
Help documentation for molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "molsketch-doc-0.8.0-1.1.noarch.rpm"
RPM_HASH = "6bf4993b52dd042da625ba9d58fee54104761ef83389814389233b5b55ff98c907aca2c8705383bfdcf9a15b95bd853fd2be302e7046a7262413411289c1d9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molsketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
