SUMMARY = "Ncurses Spotify client"
DESCRIPTION = "Cross-platform ncurses Spotify client written in Rust, inspired \
by ncmpc and the likes."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "ncspot-0.13.2-1.1.aarch64.rpm"
RPM_HASH = "1b093b80eb8d4a103979e334aa8297071590a88d10a3d186d78053aec6cdf59cc21dc8525b9b7f76d01db67795f20e4143dd6bb00c9bccc3972848edb6270aa9"

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
