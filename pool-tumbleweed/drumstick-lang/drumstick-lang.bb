SUMMARY = "Translations for package drumstick"
DESCRIPTION = "Provides translations for the 'drumstick' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-lang-2.7.2-1.4.noarch.rpm"
RPM_HASH = "6e392fe82453f6359b500a0d7587fe82c2a2ce0e5d213cc41c73f8b7311ec466f88c87743303d36ab01f2aa81b561bc499e98ef3172d8f8eaecfeeb0be486d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drumstick-lang \
drumstick-lang-all"

RDEPENDS:${PN} += "drumstick"

inherit rpm
