SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-lang-6.4.11-4.22.noarch.rpm"
RPM_HASH = "a35ba49486ed2e5396671a73a9031ac868d40786695e5f6b3905a8b0f36c8e9a027a536e3928161941201672192bbef058e64f3d8c4004fcc7e251a766cf9c14"
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
