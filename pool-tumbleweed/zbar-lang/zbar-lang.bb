SUMMARY = "Translations for package zbar"
DESCRIPTION = "Provides translations for the 'zbar' package."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "zbar-lang-0.23.90-4.1.noarch.rpm"
RPM_HASH = "4e1e6af0c191093bc233a33841fe79f42e99a75edba7ddb906d36a4305a17dc86fa60268ee582f3d0b2aff69e47934ad1bfee911b2a1ee5a41b3d23ca3ebbf83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zbar-pt-BR \
zbar-lang \
zbar-lang-all"

RDEPENDS:${PN} += "zbar"

inherit rpm
