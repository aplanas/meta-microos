SUMMARY = "Translations for package deepin-screen-recorder"
DESCRIPTION = "Provides translations for the 'deepin-screen-recorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-screen-recorder-lang-5.11.6-1.7.noarch.rpm"
RPM_HASH = "65e9b54d1f4479639af0070cdcbd34c9ae79bfe626e1faecaba1be22d77a0cdd0ac0aeaf9179a49f592c593a6ecc53630d6740f111b9393b3c5e34518fced8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-screen-recorder-lang \
deepin-screen-recorder-lang-all"

RDEPENDS:${PN} += "deepin-screen-recorder"

inherit rpm
