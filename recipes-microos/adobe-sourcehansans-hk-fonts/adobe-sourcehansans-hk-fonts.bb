SUMMARY = "Source Han Sans HK"
DESCRIPTION = "Source Han Sans is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "adobe-sourcehansans-hk-fonts-2.004-1.6.noarch.rpm"
RPM_HASH = "298f21b90817b99a04d664f7f541ce67834b25fcc83a0d1dd00716cce7ee711a9c0b87615b670283e2ce1c1cc506a4e40ae3b6d8d461c40f6aa05b3c170f0285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-hk-fonts locale(zh_HK) scalable-font-zh_HK"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
