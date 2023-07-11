SUMMARY = "Translations for package deepin-dock"
DESCRIPTION = "Provides translations for the 'deepin-dock' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-lang-5.5.65-1.4.noarch.rpm"
RPM_HASH = "4db6cae002d0edda2ad681ee4c0da8bb4d3c3f85052090b48271fe3a1477bd65e414006fc820c63f5d4cc89916a25cb54d9e2e5d1675a6f0c920555653cce58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-dock-lang \
deepin-dock-lang-all"

RDEPENDS:${PN} += "deepin-dock"

inherit rpm
