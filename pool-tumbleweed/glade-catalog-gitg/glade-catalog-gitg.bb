SUMMARY = "Git repository viewer -- Catalog for Glade"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation. \
 \
This package provides a catalog for Glade, to allow the use the gitg \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "glade-catalog-gitg-41-2.10.aarch64.rpm"
RPM_HASH = "802ca2155240501dcb588f877924cd5001817a0d7e3954561a5804e7aba17d7571dde9c6820a9e5f7322a35688f3f75324296a82907dd564ef308ab52d75f9f3"

RPROVIDES:${PN} += "glade-catalog-gitg"

RDEPENDS:${PN} += "glade \
libgitg-1-0-0"

inherit rpm
