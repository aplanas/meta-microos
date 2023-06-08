SUMMARY = "Wu table for Fcitx"
DESCRIPTION = "Fcitx Wu table for Simplified Chinese. \
 \
It's not Wubi, but Shanghainese. \
 \
Wu is a dialect used in a few provinces in the south end beach of yangtse river. \
 \
If you don't know what it is, don't try."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-cn-wu-0.3.8-2.5.noarch.rpm"
RPM_HASH = "93c3c4f78fc8140ad53f8d8c78d25c06778e2e8e0b40881b028abe48ecc51ce7692b808a267bedb0248f2d4f752f0591d3c974184b1a0da3378e30ab384b405a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wu fcitx-table-extra"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
