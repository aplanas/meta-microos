SUMMARY = "Utility to search for files"
DESCRIPTION = "The GNOME Seach Tool uses command-line tools such as find and locate \
to get results."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "gnome-search-tool-3.6.0-11.9.aarch64.rpm"
RPM_HASH = "64f283c18fa7d2faa278cca05396770bd7aa7110d18b491e97c09e6abcba3ac536a9cf31171e08dac0c23a8a7b76d4dd9089574287f9ca104e5218ba475b819e"

RPROVIDES:${PN} += "application() \
application(gnome-search-tool.desktop) \
gnome-search-tool \
gnome-search-tool(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
