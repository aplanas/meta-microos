SUMMARY = "Translations for package abook"
DESCRIPTION = "Provides translations for the 'abook' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-lang-0.6.1-3.13.noarch.rpm"
RPM_HASH = "7c9c611d4b787eed418f66788376b4c1a5c18979270ad8c26a8fbd4db29a83b231252bf29aa634fb0ce2e5a19bf04935dd1f8162b5c2ea0b07a0440bef3090a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abook-lang \
abook-lang-all \
locale(abook:de) \
locale(abook:fr) \
locale(abook:it) \
locale(abook:ja) \
locale(abook:sv)"

RDEPENDS:${PN} += "abook"

inherit rpm
