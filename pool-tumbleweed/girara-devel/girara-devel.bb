SUMMARY = "Header files for the girara library"
DESCRIPTION = "Header files for the girara user interface library."
LICENSE = "Zlib"

PV = "0.3.9"

RPM_NAME = "girara-devel-0.3.9-1.3.aarch64.rpm"
RPM_HASH = "cd32f3717b0f52458278a59de2171211e2de066fa2d5a71c2f231b41cd0537cf66c5510a90bbdc933b20c726b66b0103c0a0ff450d68a68612dbcba66e6cea4a"

RPROVIDES:${PN} += "girara-devel \
girara-devel(aarch-64) \
pkgconfig(girara-gtk3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgirara-gtk3-3 \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(pango)"

inherit rpm
