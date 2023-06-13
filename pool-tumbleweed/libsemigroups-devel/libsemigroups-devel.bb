SUMMARY = "Development files for the Semigroups library"
DESCRIPTION = "A C++14 library containing implementations of several algorithms for \
computing finite and finitely presented semigroups, namely. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libsemigroups-devel-2.7.1-1.1.aarch64.rpm"
RPM_HASH = "a117c03810ff988f8af03cf230835b34520dd72c1f49bb7f52c7b30a8a20d41ad421587b2e2c6d9e00e83ba4819f73332e6d3d040a98f765e75ca5d6dcdd6fb9"

RPROVIDES:${PN} += "libsemigroups-devel \
libsemigroups-devel(aarch-64) \
pkgconfig(libsemigroups)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemigroups2 \
pkgconfig(eigen3) \
pkgconfig(fmt)"

inherit rpm
