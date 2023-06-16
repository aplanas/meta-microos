SUMMARY = "Source Han Sans CN"
DESCRIPTION = "Source Han Sans is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "adobe-sourcehansans-cn-fonts-2.004-1.6.noarch.rpm"
RPM_HASH = "7cf067d76cac69b24d9d312b3435953e0805e82a3017efd07969f45e82e7d26cfe1d9425c146834189e76a8d8e49b3d9cbcfa9fdc1bb62012cc69d6c1ae0e559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-cn-fonts \
locale-zh-CN \
scalable-font-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
