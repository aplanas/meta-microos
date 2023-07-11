SUMMARY = "GNOME Command Line Dialog Utility"
DESCRIPTION = "Zenity is a basic rewrite of gdialog, without the pain involved of \
trying to figure out commandline parsing.  Zenity is zen-like; simple \
and easy to use. \
 \
Zenity Dialogs: Calendar, Text Entry, Error, Informational, File \
Selection, List, Progress, Question, Text Information, Warning and \
Password. \
 \
Zenity is especially useful in scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "3.99.0"

RPM_NAME = "zenity-3.99.0-1.1.aarch64.rpm"
RPM_HASH = "9477670ddba683e242c9b8966adefa3030caea9bc30813f2fda27c5feae475defc58182927cdabd5aaa68c8827bcdcc9a103e5b75444f7edffbc3270b8291513"

RPROVIDES:${PN} += "zenity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
