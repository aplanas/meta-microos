SUMMARY = "Upstream Branding of the Deepin Desktop Environment"
DESCRIPTION = "This package provides the upstream definition for Deepin Desktop GSchemas."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-branding-upstream-5.10.11-2.3.noarch.rpm"
RPM_HASH = "87892cda3bbb443874eb928cb8495db30bdf30fcfdeee10b9656e4a455a38cbbfdad2ba50096f5ab759b5cfba5171ab3f337f834fc04dcd3174b2543d7e776bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas-branding \
deepin-desktop-schemas-branding-upstream"

RDEPENDS:${PN} += "deepin-desktop-schemas"

inherit rpm
