SUMMARY = "Ncurses Spotify client"
DESCRIPTION = "Cross-platform ncurses Spotify client written in Rust, inspired \
by ncmpc and the likes."
LICENSE = "BSD-2-Clause"

PV = "0.13.3"

RPM_NAME = "ncspot-0.13.3-1.1.aarch64.rpm"
RPM_HASH = "04827f3c93582fa2385d9777accdd953ffc5cca31aaad18e7fefe07ca75662348bb225d69b24b98d9afa2fceb2f102229ad84b0c6b628498c5050f8a9bb22d06"

RPROVIDES:${PN} += "ncspot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libssl.so.3 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
