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

RPM_NAME = "caribou-gtk-module-common-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "63f6b52f857a433654c35608372295c0f64f4657cf4dd88758d025518873148d9295a440e36f33064483de582d56b5a2a9048468599915adfe0908fe36d52e6d"

RPROVIDES:${PN} += "caribou-gtk-module-common"

RDEPENDS:${PN} += ""

inherit rpm
