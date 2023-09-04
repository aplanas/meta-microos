SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-lv-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "8061f912e5a367d2158a29d4b176260beb439e2aaf7659250ae41d6b14a9f88bdca979cc5d9b40e3805204d7173cddc05d79286e10c45d27492832eef399547e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm
