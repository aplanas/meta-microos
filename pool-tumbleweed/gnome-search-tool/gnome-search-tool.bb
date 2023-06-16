SUMMARY = "Utility to search for files"
DESCRIPTION = "The GNOME Seach Tool uses command-line tools such as find and locate \
to get results."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "gnome-search-tool-3.6.0-11.9.aarch64.rpm"
RPM_HASH = "64f283c18fa7d2faa278cca05396770bd7aa7110d18b491e97c09e6abcba3ac536a9cf31171e08dac0c23a8a7b76d4dd9089574287f9ca104e5218ba475b819e"

RPROVIDES:${PN} += "gnome-search-tool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
