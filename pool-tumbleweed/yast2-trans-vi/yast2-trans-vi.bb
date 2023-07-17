SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-vi-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "9262cb60c10dc70b0f0a91c985db7d2fe4af4a0c725a40a7d3e32f7392e9dc2d3705b01486bc190b1a1d1be3023fb25e6089f478087ae7ae33dfb2b5016fd580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
