SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations. \
 \
This packlage provides documentation for LiE."
LICENSE = "LGPL-3.0+"

PV = "2.2.2"

RPM_NAME = "LiE-doc-2.2.2-6.33.aarch64.rpm"
RPM_HASH = "eb9920c87013d7a181e5788fcc5426baba2fd966e2b665fa029dfd0b92280b3caec18ea3326c6aaac9fc7dfac59174bc05186b6091f265ca8583416dc42425fd"

RPROVIDES:${PN} += "LiE-doc"

RDEPENDS:${PN} += ""

inherit rpm
