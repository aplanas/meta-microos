SUMMARY = "Mind-mapping app"
DESCRIPTION = "A program to create, develop, visualize, organize and manage ideas."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "minder-1.14.0-1.8.aarch64.rpm"
RPM_HASH = "9dfd9fe5bc172b8e2eafbd763aa12187bcdea7565215d83f0f7e86e2b6c099c299f6519e8b0133355544ad5328bfb73d468a3a678fa5219d1584aab4078d9fbb"

RPROVIDES:${PN} += "minder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmarkdown.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
