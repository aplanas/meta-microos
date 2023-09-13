SUMMARY = "Developer documentation for libadwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the documentation for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.5"

RPM_NAME = "libadwaita-docs-1.3.5-1.1.noarch.rpm"
RPM_HASH = "fb6ef86e0409cc560d961deae0609ec63eca3444a8f5c23f4a8a8fb7cac1101f27875bde47902aa695ea6231a3a0a0b7f958f4efd50840155bf699ab2661a721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-docs"

RDEPENDS:${PN} += ""

inherit rpm
