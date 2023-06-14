SUMMARY = "MATE dictionary"
DESCRIPTION = "This is the MATE dictionary as shipped with the MATE utilities. \
mate-dictionary is a program which can look up the definition of \
words"
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-dictionary-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "4dbd695e81e9e38c069afe0d2fb3bcdc0eb8ab3b1b82e892f11c8a3f49cf4d3ec8fdce135533c2a0fbc0d3b23eaa38951dacb15df4435cdbd8bc47e66dc54f84"

RPROVIDES:${PN} += "mate-dictionary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1 \
libmatedict.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
mate-desktop-gschemas"

inherit rpm
