SUMMARY = "Translations for package fldigi"
DESCRIPTION = "Provides translations for the 'fldigi' package."
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "fldigi-lang-4.1.26-1.4.noarch.rpm"
RPM_HASH = "b1aaa06ddbdea3467095d56d864cea2dbd5235d03a3a9022cfadc25ae6f6d036e41efc909274560f0782c3590e49c53b9c20ad0db2259f8d146bf430e9971e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fldigi-lang \
fldigi-lang-all \
locale-fldigi-de \
locale-fldigi-el \
locale-fldigi-es \
locale-fldigi-fr \
locale-fldigi-it \
locale-fldigi-nl \
locale-fldigi-pl \
locale-fldigi-ru"

RDEPENDS:${PN} += "fldigi"

inherit rpm
