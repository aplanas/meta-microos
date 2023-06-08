SUMMARY = "Headers etc. for finch Stuffs"
DESCRIPTION = "The finch-devel package contains the header files, developer \
documentation, and libraries required for development of Finch \
scripts and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "finch-devel-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "23e82e72201b924e6a350e65ff0df7d04c09d313a6137bfdda4f0a80f8e1c98ebd028040c810fb3830c91c0e2b9286fed6602ea2254997810b844dae309999ad"

RPROVIDES:${PN} += "finch-devel finch-devel(aarch-64) pkgconfig(finch)"
RDEPENDS:${PN} += "/usr/bin/pkg-config finch glibc-devel libpurple-devel ncurses-devel pkgconfig(glib-2.0) pkgconfig(gnt) pkgconfig(purple)"

inherit rpm
