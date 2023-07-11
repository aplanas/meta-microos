SUMMARY = "Translations for package kio-stash"
DESCRIPTION = "Provides translations for the 'kio-stash' package."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "kio-stash-lang-1.0-1.30.noarch.rpm"
RPM_HASH = "199e6b4111c9def0504ade12d7d4e31f7040edc5ec1c9bc256234677bf5bca3885cf2c331ea2e6676329b1a12e2c24d5e5fea8aad00837958409d3b304b86bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-stash-lang \
kio-stash-lang-all"

RDEPENDS:${PN} += "kio-stash"

inherit rpm
