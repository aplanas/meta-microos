SUMMARY = "On-screen Keyboard for GNOME -- Common Files for GTK+ Modules"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device. \
 \
This package contains files common to both the GTK+ 2 and GTK+ 3 \
modules."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk-module-common-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "003ca80627e6f13ada09ba587adec8cab972d3186d06b6f970e69558ee58e35518bc22b5138465f4dc161ff4ad2658b97d0c55f8652b7faf21b8bf415d2c0840"

RPROVIDES:${PN} += "caribou-gtk-module-common"

RDEPENDS:${PN} += ""

inherit rpm
