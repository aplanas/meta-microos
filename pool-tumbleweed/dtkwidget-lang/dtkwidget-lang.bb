SUMMARY = "Translations for package dtkwidget"
DESCRIPTION = "Provides translations for the 'dtkwidget' package."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-lang-5.5.52-1.8.noarch.rpm"
RPM_HASH = "e0eb5e435ce8fcf10937340a042e665443698c808986e68843cd16fed04093233d9f90ef228393dee126f4aee56ca97aa14275bfdf8ba5a472697631d658521a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtkwidget-lang \
dtkwidget-lang-all"

RDEPENDS:${PN} += "dtkwidget"

inherit rpm
