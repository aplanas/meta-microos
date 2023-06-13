SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtutf-devel-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "7fa7d3efde0d513ba386399449d4e25b42b830db02ddabfecf6178a937bae8b1a3f1b82e58412da94b8d72feec7c8851187e5be9302c18f97e84e563522e0b44"

RPROVIDES:${PN} += "libTutf-devel \
libtutf-devel \
libtutf-devel(aarch-64)"

RDEPENDS:${PN} += "libtutf1"

inherit rpm
