SUMMARY = "Development Files for libskk"
DESCRIPTION = "The eekboard-devel package contains the header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-devel-1.0.8-10.9.aarch64.rpm"
RPM_HASH = "924b9ceea00b5965b476ee9b208774599ef76183f92ce35170af1196a5a9fc53c71e44273706ef3a310a7ab78cf381bfd01f11d3d7b3f0128b5aad968c20a42b"

RPROVIDES:${PN} += "eekboard-devel eekboard-devel(aarch-64) pkgconfig(eek-0.90) pkgconfig(eek-gtk-0.90) pkgconfig(eek-xkl-0.90) pkgconfig(eekboard-0.90)"
RDEPENDS:${PN} += "/usr/bin/pkg-config eekboard pkgconfig(eek-0.90) pkgconfig(gio-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libxklavier)"

inherit rpm
