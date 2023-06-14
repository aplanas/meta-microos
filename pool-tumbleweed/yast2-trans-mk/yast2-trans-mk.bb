SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-mk-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "2c1e6a491f2a9caef11abb8bb66ca8146359986eb179ba34e7c73fe5fd02b7e4f09ab2394fe81a3439d32ec062dc45d9e827f3ea309aab4e4d5dde31b6526f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
