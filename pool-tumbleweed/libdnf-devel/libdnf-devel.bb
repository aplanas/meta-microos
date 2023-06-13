SUMMARY = "Development files for libdnf"
DESCRIPTION = "This package provides the headers and libraries for developing applications \
that use libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf-devel-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "ae7a476b057b199c794541e22802a8821fcc4808f652d4f907a1ab4c7f72c322021df569c9c50eb16e26e6e5ed0d0e4bb106e0349bf10961faae5f975d03f3db"

RPROVIDES:${PN} += "libdnf-devel \
libdnf-devel(aarch-64) \
pkgconfig(libdnf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf2(aarch-64) \
pkgconfig(glib-2.0) \
pkgconfig(librepo) \
pkgconfig(libsolv) \
pkgconfig(libsolvext) \
pkgconfig(rpm) \
pkgconfig(sqlite3)"

inherit rpm
