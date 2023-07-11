SUMMARY = "Translations for package liblinphone"
DESCRIPTION = "Provides translations for the 'liblinphone' package."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone-lang-5.2.50-1.3.noarch.rpm"
RPM_HASH = "c23966c8732a6710960f033a296249e025d1aa564a3da6164e7d17aa9577da56f9e859dbd89000c253096eabf001a6484a9e304d8aa4230aa4fe31c72f3b419b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-lang \
liblinphone-lang-all"

RDEPENDS:${PN} += "liblinphone"

inherit rpm
