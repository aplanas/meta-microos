SUMMARY = ".desktop links for the canberra-gtk-play utility"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the canberra-gtk-play .desktop files for the \
gnome-desktop and gdm. \
Currently there are no desktop-login, desktop-logout or \
session-ready sounds in the freedesktop sound theme, so installing \
this will require a different sound-theme for it to be operational."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "canberra-gtk-play-gnome-0.30-15.23.aarch64.rpm"
RPM_HASH = "a7b8939bb977962677c4427946b38f458badbb24ba60ed35afc2de575d2ddaacd04c9c7ed5f242b1969b4a134c440800ef55757dbb1423ca73b84bca048b9d3f"

RPROVIDES:${PN} += "canberra-gtk-play-gnome \
libcanberra-gtk-gnome"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
