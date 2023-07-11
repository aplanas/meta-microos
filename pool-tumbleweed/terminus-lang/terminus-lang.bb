SUMMARY = "Translations for package terminus"
DESCRIPTION = "Provides translations for the 'terminus' package."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "terminus-lang-2.3.1-1.2.noarch.rpm"
RPM_HASH = "f553701eae25702eb2ab1b03f24a193600f187cd97a19fdaa843efa068e85f9ea133b23e2652093e46669a48de4492242868f0e1ee541c4b744f58b2cb7ff3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-terminus-es \
terminus-lang \
terminus-lang-all"

RDEPENDS:${PN} += "terminus"

inherit rpm
