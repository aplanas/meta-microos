SUMMARY = "Translations for package cantata"
DESCRIPTION = "Provides translations for the 'cantata' package."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "cantata-lang-2.5.0-2.9.noarch.rpm"
RPM_HASH = "2b95b1c2c0ce71402b603194085a134946ff72ad1c3c9e4b6aebba3e37902962fdf5afe9b6bab69df3ca0c32f34fe11aed03e2b19115e472d14e57b084d173e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantata-lang \
cantata-lang-all"

RDEPENDS:${PN} += "cantata"

inherit rpm
