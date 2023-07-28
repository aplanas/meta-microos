SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-si-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "f2e819c9bd40ef054cd4c2787232807c08983d26f36eb1098080262cecb10e6ac11a8bd6812584105f34e8652687bacae10af120bcdf00b17e55dd17da3f59e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm
