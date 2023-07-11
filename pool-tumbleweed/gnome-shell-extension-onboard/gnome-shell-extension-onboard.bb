SUMMARY = "GNOME Shell extension for onboard, an on-screen keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users. \
 \
This GNOME Shell extension integrates the onboard keyboard with the GNOME Shell."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "gnome-shell-extension-onboard-1.4.1-7.7.noarch.rpm"
RPM_HASH = "8f126c988c1bc4490ff7a9fe764121118fbaacf3f75cf7adb1d4dd290b17c1b5fb26f7957bb46cf86adf8dddcda2966fab664f9c90dcfd5661b21cdbc0752a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-onboard"

RDEPENDS:${PN} += "gnome-shell \
onboard \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Shell \
typelib-St"

inherit rpm
