SUMMARY = "Glade catalog for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides a catalog for Glade, to allow the use the libpeas \
widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "glade-catalog-libpeas-1.36.0-1.1.noarch.rpm"
RPM_HASH = "7c60864810b95f5a9fd17d91bae6c48990cf9d4db405cf9aa2d7805b1eae4ccb2eb5aef3f53da8c2222d0f52280aaaaf5f3b164e96012f3912bf4ac03ab2ecc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-catalog-libpeas"

RDEPENDS:${PN} += "glade \
libpeas-gtk-1-0-0"

inherit rpm
