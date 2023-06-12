SUMMARY = "Translations for package qps"
DESCRIPTION = "Provides translations for the 'qps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "qps-lang-2.7.0-1.1.noarch.rpm"
RPM_HASH = "795404999487d4610e8ccfcf6474d69f51c91541d4b3d90a60787fe581d4e7ba1efd941ae90396c4cd00eb119fea02a05eafda4f61648bbfbe827a67c114136c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qps-lang \
qps-lang-all"
RDEPENDS:${PN} += "qps"

inherit rpm
