SUMMARY = "CNS 11643 table for Fcitx"
DESCRIPTION = "Fcitx Chinese National Standard 11643 table for Simplified Chinese. \
 \
It's also called Chinese Standard Interchange Code. \
And it's a superset of ASCII. \
 \
See: http://en.wikipedia.org/wiki/CNS_11643 for details. \
 \
If you don't know what it is, don't try. \
Actually no Chinese use it either."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-cn-cns11643-0.2.4-2.5.noarch.rpm"
RPM_HASH = "212588aea6ebea288f42bf2f801b1f3f2fc754eee6d3c9430ee3d5cdb2238cdbf956704f1f058160f7b161759d5f401ab6e87b869c866b8512a1731d76c7a693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cns11643 \
fcitx-table-other"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
