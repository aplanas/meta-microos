SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kded-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "dad7eaa34c0fdae63cbccc10f9a53504133114965d33d3c32ff672d90f86c7aa4170e9dec49484a39c863a052c81c61bb0dd7540c4fb8b528018f52adc7f1f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang \
kded-lang-all"

RDEPENDS:${PN} += "kded"

inherit rpm
