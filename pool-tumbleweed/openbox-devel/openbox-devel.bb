SUMMARY = "Includes and static libraries for openbox"
DESCRIPTION = "Development Includes and static libraries for openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-devel-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "e53e941da00b3faa2599e710f477da36825c38f6ec025e908f87a6144860642aae7a9cb07802e06b4e7b48b417c0e595c753b40e34508053b15a1c1e7b74e3e1"

RPROVIDES:${PN} += "openbox-devel \
openbox-devel(aarch-64) \
pkgconfig(obrender-3.5) \
pkgconfig(obt-3.5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libobrender32 \
libobt2 \
pkgconfig(glib-2.0) \
pkgconfig(ice) \
pkgconfig(imlib2) \
pkgconfig(librsvg-2.0) \
pkgconfig(libxml-2.0) \
pkgconfig(obt-3.5) \
pkgconfig(pangoxft) \
pkgconfig(sm) \
pkgconfig(x11) \
pkgconfig(xft)"

inherit rpm
