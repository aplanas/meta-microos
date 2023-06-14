SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste-gtk4-0-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "e893d3cc15015124ba37b8e84c50455809c012bdacbeeabf1637a834edfb18f57441d2006de1b5bc821bd56f7860bb97e39d7eeb6ae31162757f1246049752fe"

RPROVIDES:${PN} += "libgpaste-gtk4-0 \
libgpaste-gtk4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libadwaita-1.so.0 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-4.so.1"

inherit rpm
