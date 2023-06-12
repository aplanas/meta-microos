SUMMARY = "Translations for package libgaminggear"
DESCRIPTION = "Provides translations for the 'libgaminggear' package."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggear-lang-0.15.1-3.15.noarch.rpm"
RPM_HASH = "dc0c3b14cdc997b345e01c288881f079c980819364820cc467588b64e249ef4438a0f329c2379b6432df648274c7f2efb4254d8dc21db232caa5cf840b234d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgaminggear-lang \
libgaminggear-lang-all \
locale(libgaminggear:de) \
locale(libgaminggear:en)"
RDEPENDS:${PN} += "libgaminggear"

inherit rpm
