SUMMARY = "BCUnit development files"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit development files."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "bcunit-devel-3.0.2+git.20191119-1.13.aarch64.rpm"
RPM_HASH = "0a243a8e59eec18bdd8c4a647c2e6e8e05be07860437fda7552d726dcdace53021b592757998b30c55bd9ebb90245f58a7fcb824597828bdd6e3bf85e4cc8261"

RPROVIDES:${PN} += "bcunit-devel \
bcunit-devel(aarch-64) \
pkgconfig(bcunit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcunit1 \
ncurses-devel"

inherit rpm
