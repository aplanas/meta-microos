SUMMARY = "Translations for package fntsample"
DESCRIPTION = "Provides translations for the 'fntsample' package."
LICENSE = "CC-PDDC & GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "fntsample-lang-5.4-1.1.noarch.rpm"
RPM_HASH = "a6095c7ba9836353cf3151d034d41d1bc8a967cb82a5cdca58b397e488a75cd9cab7bd6bd327294b69d611854f3216869010dcc49b4bdbead7f38babb2eef73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fntsample-lang \
fntsample-lang-all \
locale-fntsample-uk"

RDEPENDS:${PN} += "fntsample"

inherit rpm
