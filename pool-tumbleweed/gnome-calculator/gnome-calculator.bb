SUMMARY = "A GNOME Calculator Application"
DESCRIPTION = "A GNOME calculator package based on calctool and MP library."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-44.0-1.1.aarch64.rpm"
RPM_HASH = "bb45d4fadeb0122437fd697875e46d267606b50748079373c8822dca40fa50a8252b5b8d8421b3c90bf0d4a36190f590ec442dec45b3b238c83670ed7cf0f029"

RPROVIDES:${PN} += "gnome-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libmpc.so.3 \
libmpfr.so.6 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
