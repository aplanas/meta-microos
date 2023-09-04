SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-pa-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "458b11bbdec10abc4acbb29f774b23b7972fde885f91869a801c935207b157bc90692d9fa2ba2388c0605cc52e13456bf1e4e73bebe41742689f60678cff071c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
