SUMMARY = "Portable sound event library -- Common Files for GTK+ Modules"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains files common to both the GTK+ 2 and GTK+ 3 \
modules."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk-module-common-0.30-15.23.aarch64.rpm"
RPM_HASH = "76de357e1259a512b4be874bea483c451fa36f10cdb4d8aa872fb0c8e8d30ae4343583481325ce84a1b7542eee6d61280a1a112848bb7a8aed651d7e8d5b791d"

RPROVIDES:${PN} += "libcanberra-gtk-module-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
