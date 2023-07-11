SUMMARY = "Brasero media utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions \
related to disc image creation and extraction, and drive handling."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-media3-1-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "10a51f86c00616faf845e4fecb2488f6ce6e44644e216ed98318fed52e8ab04544b36a2e3b6f0a8b6c009795aed5ea588260923febe9483f131963de70ed60e9"

RPROVIDES:${PN} += "libbrasero-media3-1 \
libbrasero-media3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
