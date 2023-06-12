SUMMARY = "Icefrog Holography(QXM) table for fcitx"
DESCRIPTION = "Fcitx Icefrog Holography (Bing Chan Quan Xi, or QXM) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-bingchan-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "28c6fd5a86b14fe397df0b151967f3ffc8844180173710e2a6a48e6ccfcf41a42189b01b8c1a73051f4a031718327bc40abb2089b59c844d3f60b69b3c42a335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-bingchan"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
