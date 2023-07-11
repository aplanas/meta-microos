SUMMARY = "Graphical text editor and Notepad clone"
DESCRIPTION = "Leafpad is a GTK+ based text editor. The user interface is similar to \
'notepad'. It uses a Single Document Interface to set out windows to view at a \
time, and purposely uses no toolbar. Character encoding is autodetected."
LICENSE = "GPL-2.0"

PV = "0.8.18.1"

RPM_NAME = "leafpad-0.8.18.1-15.23.aarch64.rpm"
RPM_HASH = "e3be91e8c8dcf696445603bceb40e2aea5658eca6001e4035d461cc9b6223c9e499d81b5c329c693057fcb204d74ad9ebdc114bd7e10aa3e15f49923a51641bf"

RPROVIDES:${PN} += "leafpad"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
