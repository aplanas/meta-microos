SUMMARY = "Manual for the lite version of nanoxml"
DESCRIPTION = "Documentation for the lite version of nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-lite-2.2.3-4.6.noarch.rpm"
RPM_HASH = "f5af77c9da40e5751ad97ceef33360e53aace64ecb29cbc797854776f05825e381f721981625b24cfb5aba58da9af764319eb3fcd61163a67a2120368334976c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual-lite"
RDEPENDS:${PN} += ""

inherit rpm
