SUMMARY = "Source Han Serif KR"
DESCRIPTION = "Source Han Serif is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License, Version 1.1."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "adobe-sourcehanserif-kr-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "94d888d3f38063f6a88b6111fbe4d91bd1754c21ee7454feaaff3781cdfb37fe46302af93e9b524eeb40c42d24120c09e9280d739cadc9ed71f077ce332295b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-kr-fonts \
locale(kr) \
scalable-font-kr"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
