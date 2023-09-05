SUMMARY = "Icefrog Holography(QXM) table for fcitx"
DESCRIPTION = "Fcitx Icefrog Holography (Bing Chan Quan Xi, or QXM) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-bingchan-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "e0cb6e6989b7eefc81d383f3fcf8df0b82690b77d7ea776f078efc1a522fa6ddd7eed22ff91f9ebb33007eadd467095ccfd635fe91d9671dbe4c482c3bb77403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-bingchan"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
