SUMMARY = "Graphical text editor and Notepad clone"
DESCRIPTION = "Leafpad is a GTK+ based text editor. The user interface is similar to \
'notepad'. It uses a Single Document Interface to set out windows to view at a \
time, and purposely uses no toolbar. Character encoding is autodetected."
LICENSE = "GPL-2.0"

PV = "0.8.18.1"

RPM_NAME = "leafpad-0.8.18.1-15.22.aarch64.rpm"
RPM_HASH = "c361fbebc77936e297d26901ade5d742feeff8b22ae2a47bb2a82b848372fd5fe4aac274b6519d6a7c18fe9c5d6567eb3cc97735b971bd26d88c67f5f2be03c1"

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
