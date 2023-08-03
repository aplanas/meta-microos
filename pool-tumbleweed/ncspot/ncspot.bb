SUMMARY = "Ncurses Spotify client"
DESCRIPTION = "Cross-platform ncurses Spotify client written in Rust, inspired \
by ncmpc and the likes."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ncspot-0.13.4-1.1.aarch64.rpm"
RPM_HASH = "3cb6117d95a704a6243df8c5cc39eef2417ecc09673edd216082192fe535e3d6f7530a8f300df62375b34bcb1783740fbee6c60a1c1f49813bd16bf8431d73fb"

RPROVIDES:${PN} += "ncspot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libssl.so.3 \
libxcb.so.1"

inherit rpm
