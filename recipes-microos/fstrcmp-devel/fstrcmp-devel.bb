SUMMARY = "Development files for libfstrcmp"
DESCRIPTION = "The fstrcmp-devel package contains libraries and header files for \
developing applications that use libfstrcmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "fstrcmp-devel-0.7.D001-1.15.aarch64.rpm"
RPM_HASH = "ff75e4777ed91b0d48060a9a2709ddd4869b2326f28c26e317505191405b83fac344a44af8810a5dcdf30ca68f1d9babd83973e171744a5c2592c6a24bdf71ba"

RPROVIDES:${PN} += "fstrcmp-devel fstrcmp-devel(aarch-64) pkgconfig(fstrcmp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfstrcmp0"

inherit rpm
