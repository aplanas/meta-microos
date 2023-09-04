SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "8acb7320d4c06613b88d89e4a04dbf70fe2127c8de8e543bd523636cec758c9fb9f6fe00dab2b9ae1e478a87ed286108c1585a4250fe909d640c7ab2be020d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
