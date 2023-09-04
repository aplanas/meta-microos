SUMMARY = "Translations for package cantata"
DESCRIPTION = "Provides translations for the 'cantata' package."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "cantata-lang-2.5.0-3.1.noarch.rpm"
RPM_HASH = "394059b7acf9b89ffc960c8add0b4b58794edb32350f7bccaa771f89da76335e4119cb2833ff47a3da5391e4316084db0cd02cc9c9a2589963ccef36214a8a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantata-lang \
cantata-lang-all"

RDEPENDS:${PN} += "cantata"

inherit rpm
