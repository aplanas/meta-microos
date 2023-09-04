SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "49c31d3aa55838afa7e48e4175e9bb3f3411b0a7794267d31ffdd261307e6b6852e578c3fb19b44de73134f97c0b8b29a5afb171d40d2b918f7ca484c8da7343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
