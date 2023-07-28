SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-hu-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "2d177d309586fe5e7e4148ee7749e506af579eaaacdc256a3e95eb0cffa9279287303c6198a5416336600b9d6c3b0fb5634005720099ac92ff51c69474cab79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
