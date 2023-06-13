SUMMARY = "Translations for package brltty"
DESCRIPTION = "Provides translations for the 'brltty' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-lang-6.5-2.4.noarch.rpm"
RPM_HASH = "5530f6bc14250fc100576a0219e4cae8d271e51a0155544b03211e31cb7568ffcd111ed4b6bc8f8cf5306d969ebdff5d0108253e2c546e640bb5a90ca43cc2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brltty-lang \
brltty-lang-all \
locale(brltty:ar) \
locale(brltty:de) \
locale(brltty:fr) \
locale(brltty:it) \
locale(brltty:ru) \
locale(brltty:zh)"

RDEPENDS:${PN} += "brltty"

inherit rpm
