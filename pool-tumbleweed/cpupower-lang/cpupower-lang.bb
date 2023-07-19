SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-lang-6.4.3-4.17.noarch.rpm"
RPM_HASH = "858d1f978bb814a66091028d257ec57f0569516095e1eabf7c42d4aac03cea5c3d2e0e7abdf2649d5d2b5fdf135a3d4d9649c6478777634e80d1eacaa59a20fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang \
cpupower-lang-all \
locale-cpupower-cs \
locale-cpupower-de \
locale-cpupower-fr \
locale-cpupower-it \
locale-cpupower-pt"

RDEPENDS:${PN} += "cpupower"

inherit rpm
