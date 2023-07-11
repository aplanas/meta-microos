SUMMARY = "Icefrog Holography(QXM) table for fcitx"
DESCRIPTION = "Fcitx Icefrog Holography (Bing Chan Quan Xi, or QXM) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-bingchan-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "a74fda4f1a7b7b305bf8a4333278774dba4c020195f5343fc77b4260bbec05fb6cdcaed2a72b38d6360b9746d22834f46efadbb51dbfab19bfe79fcb5cbc2036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-bingchan"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
