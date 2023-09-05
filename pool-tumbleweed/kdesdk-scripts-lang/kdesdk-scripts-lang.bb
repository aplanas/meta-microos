SUMMARY = "Translations for package kdesdk-scripts"
DESCRIPTION = "Provides translations for the 'kdesdk-scripts' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kdesdk-scripts-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "72c0e35414ecd9eabf4256991be20c6fab853d59f34037f6e8f92a22533d5bd1f48c486ff23f0df4f175b25ac6f0f27658d32606f42d3d9b9369b23c4e12e5e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-scripts-lang \
kdesdk-scripts-lang-all"

RDEPENDS:${PN} += "kdesdk-scripts"

inherit rpm
