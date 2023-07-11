SUMMARY = "Development files for liballegro_primitives"
DESCRIPTION = "Development files needed to build applications which use liballegro_primitives."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_primitives5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "d1a988fd7ce813cfc35372720a358277cb88750c7d64247c2654b3b7636a41358272221bfaabdffd1105677ee3db77428840079c914c8ab883036b77beb88876"

RPROVIDES:${PN} += "liballegro-primitives5-2-devel \
pkgconfig-allegro-primitives-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-primitives5-2 \
pkgconfig-allegro-5"

inherit rpm
