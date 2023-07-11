SUMMARY = "The GNOME Desktop Menu -- Upstream Menus Definitions"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-branding-upstream-3.36.0-3.4.noarch.rpm"
RPM_HASH = "55e9f58c6dbbae2bf53033897a1d49a72335618d1f41c7ffe6baf344b662e5df6ee314fca05e074eacc3737fd5915cbf36efd3caeac6a5415aa439688e492272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-branding \
gnome-menus-branding-upstream"

RDEPENDS:${PN} += "gnome-menus"

inherit rpm
