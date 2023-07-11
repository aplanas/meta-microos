SUMMARY = "Translations for package ksnip"
DESCRIPTION = "Provides translations for the 'ksnip' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-lang-1.10.1-1.2.noarch.rpm"
RPM_HASH = "79c30faa626cb64705aa8005ccbe774db9ef27234cdfbad8305b96827021da3dac0c0d2ff222ea4015b578b932a5ad6d71035b75398980a1d247e3dab36c3b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksnip-lang \
ksnip-lang-all"

RDEPENDS:${PN} += "ksnip"

inherit rpm
