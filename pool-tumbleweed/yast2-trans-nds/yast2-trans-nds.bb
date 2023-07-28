SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-nds-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "2592ffe1c4f37c9f6688b3776db6bef758233dab8485d2723acc08a8488002ce1013da1abc2739a9f7858f54f8ddc5cca34126a2d9bf66031dc73a4548caa4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
