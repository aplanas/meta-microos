SUMMARY = "Translations for package nextcloud-desktop"
DESCRIPTION = "Provides translations for the 'nextcloud-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nextcloud-desktop-lang-3.9.0-3.1.noarch.rpm"
RPM_HASH = "da9770770c308ef9be53f6cd08d50d66cb37b81b9691bc5ae4af2fe929290fb1eef8e66a21120048e433f8c8fb60ec62e59b9cef28ec325bdb7c36841b98e5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-desktop-lang \
nextcloud-desktop-lang-all"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
