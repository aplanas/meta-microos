SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kded-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "add04f8c1e839af530ba4f27fae727b779b7d1ca0bf2d7b9d9f101a18dc564121fed9c454b465622c2d076b30a9a9d3f73bd0fe7f8f00444c0ae0a3934c43369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang \
kded-lang-all"

RDEPENDS:${PN} += "kded"

inherit rpm
