SUMMARY = "Source Han Sans KR"
DESCRIPTION = "Source Han Sans is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "adobe-sourcehansans-kr-fonts-2.004-1.6.noarch.rpm"
RPM_HASH = "80cd34ce49bf52357fd22794c80d361028a0040791497a85cdde079c637464cb3b627cb0329bf665cf8f366b3c1106a56d4d8b9aa53a7bbd8f71c7bbd3761389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-kr-fonts \
locale-kr \
scalable-font-kr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
