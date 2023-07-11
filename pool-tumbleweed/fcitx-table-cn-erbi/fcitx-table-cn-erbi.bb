SUMMARY = "Two stroke(Erbi) table for fcitx"
DESCRIPTION = "Fcitx Two Stroke (Er Bi) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-erbi-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "0d8236c78aa9c31a9581591de76da3f0b484799dc1b2c144bd19604aa121d07bdc7b3a88c81fa2bb9c8594cf5f170181267a74cde7e975ba12e964813a42c163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-erbi"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
