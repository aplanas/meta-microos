SUMMARY = "Hong Kong Guongdonkwa Penkyampji table for Fcitx"
DESCRIPTION = "Fcitx Hong Kong Guongdonkwa Penkyampji table for Traditional Chinese. \
 \
This is Hong Kong derivative of the standard Guongdonkwa Penkyampji schemes. \
 \
See: http://en.wikipedia.org/wiki/Guangdong_Romanization for details \
 \
If you don't know what it is, don't try."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-hk-cantonese-0.3.8-2.5.noarch.rpm"
RPM_HASH = "270da37129ecde4122fb2dcd8cf9c5c02528030fca8ad73d4ede54d71fe7c975f81a466609889d6139b2fae79cf733d80f04c5bf8e083c10a42063255b1d40ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra fcitx-table-hk-cantonese"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
