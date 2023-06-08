SUMMARY = "Development files for Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "anjuta-devel-3.34.0-5.6.aarch64.rpm"
RPM_HASH = "b394f05a8427df844d967bdffa8aad75e0ff6713dc31627f2cc65dc7cb0aa4ea225003a8a46a6e41594ff52666703633fcb0db28a447fb41a501b0f46c3fc1cc"

RPROVIDES:${PN} += "anjuta-devel anjuta-devel(aarch-64) anjuta-doc pkgconfig(libanjuta-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libanjuta-3-0 pkgconfig(gdl-3.0) pkgconfig(gtk+-3.0) pkgconfig(libxml-2.0) typelib-1_0-Anjuta-3_0"

inherit rpm
