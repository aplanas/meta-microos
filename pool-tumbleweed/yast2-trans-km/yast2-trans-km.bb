SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-km-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "c3aec1aad25c73052474df095a54f9ed55ad96748e46d06919583938dfd7d7814582ce728ded5f82991460edab7ce3b72361e0d64f559e052139de08052260f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
