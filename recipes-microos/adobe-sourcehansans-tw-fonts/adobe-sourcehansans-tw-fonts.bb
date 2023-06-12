SUMMARY = "Source Han Sans TW"
DESCRIPTION = "Source Han Sans is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "adobe-sourcehansans-tw-fonts-2.004-1.6.noarch.rpm"
RPM_HASH = "2416669a22a2830d0e602cfca0befadee8209a2d5b24577544d3e3af7369cf52aa2f2886a351f48f84d89cd2f1470ac1551f2022aa39fae1ce1d72ea801b6cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-fonts \
adobe-sourcehansans-tw-fonts \
locale(zh_TW) \
scalable-font-zh_TW"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
