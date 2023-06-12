SUMMARY = "Source Han Serif CN"
DESCRIPTION = "Source Han Serif is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License, Version 1.1."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "adobe-sourcehanserif-cn-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "7534829073fdad0d6a3394e7b04c081855ad21388a3e58e5fb9c9eccf66212affc98a72c61d12f506a8a514d4c303090523dca9616e4662695f8532f643695af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-cn-fonts \
locale(zh_CN) \
scalable-font-zh_CN"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
