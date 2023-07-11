SUMMARY = "Translations for package abook"
DESCRIPTION = "Provides translations for the 'abook' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-lang-0.6.1-3.14.noarch.rpm"
RPM_HASH = "5b1e4b233c5dabcdac2f828b797702b3cc99744a65d1e4d4252bf2980a9ec18614af4635dffad652ce0086143c8392854cf840d8efffe0b93d842cc447e5b2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abook-lang \
abook-lang-all \
locale-abook-de \
locale-abook-fr \
locale-abook-it \
locale-abook-ja \
locale-abook-sv"

RDEPENDS:${PN} += "abook"

inherit rpm
