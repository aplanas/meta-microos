SUMMARY = "Development environment for Gutenprint"
DESCRIPTION = "The development environment for the Gutenprint printer drivers. \
See the developers guide to Gutenprint at /usr/share/gutenprint/doc/gutenprint.pdf"
LICENSE = "GPL-2.0-or-later"

PV = "5.3.4"

RPM_NAME = "gutenprint-devel-5.3.4-1.1.aarch64.rpm"
RPM_HASH = "036e03d4cbd9cfd326637ad4846dfe486c8b32886ab8e9b436728fe792afdd7d9761ec913d7e7cfcaeb2df3a0a4227a51a9a0bac703741f3aa657325673a798c"

RPROVIDES:${PN} += "gutenprint-devel \
gutenprint-devel(aarch-64) \
pkgconfig(gutenprint) \
pkgconfig(gutenprintui2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups \
ghostscript-library \
glibc-devel \
gtk2-devel \
gutenprint \
pkgconfig(gtk+-2.0) \
pkgconfig(gutenprint)"

inherit rpm
