SUMMARY = "Translations for package cantata"
DESCRIPTION = "Provides translations for the 'cantata' package."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "cantata-lang-2.5.0-2.10.noarch.rpm"
RPM_HASH = "e50993cd898a22081e171a89c2654acce3198808e45d3935256d1fc4bccb4069be0b499c65439e71d0855f4bb3afb45c199668638624a3dfdb3c77d44ca42523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantata-lang \
cantata-lang-all"

RDEPENDS:${PN} += "cantata"

inherit rpm
