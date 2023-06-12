SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ro-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "72c0c3a90db59f9a7112112ce776c6db7248c785d12120a5f9cd801214a98aea0d7b7a3223c6a09709637e8612dff1a8fb9022392e78fa835019bd666c42f835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ro) \
yast2-trans-ro"
RDEPENDS:${PN} += ""

inherit rpm
