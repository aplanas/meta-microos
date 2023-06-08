SUMMARY = "Source Han Sans JP"
DESCRIPTION = "Source Han Sans is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "adobe-sourcehansans-jp-fonts-2.004-1.6.noarch.rpm"
RPM_HASH = "b6d6fb22833a544da6ac3d5f4c6eef7323a372b77769ef6c41a6634e8c8bee2ee9c72023cc37c37044d04cf52beb22bd3bcbfdf9c28fac44e29af87df5e64686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-jp-fonts locale(jp) scalable-font-jp"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
