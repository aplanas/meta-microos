SUMMARY = "Plugin rav1e encoder for AVIF"
DESCRIPTION = "This plugin provides the rav1e encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "libheif-rav1e-1.16.2-1.2.aarch64.rpm"
RPM_HASH = "322216ba1a5390cc2d67c0e3bf89ae024cc5681207391c6a21e4e2c15b0366ce9ce797ab8c2498d34c8cee6a89e155463067d0e5b5fa0a560d958d412cc0c822"

RPROVIDES:${PN} += "libheif-rav1e \
libheif-rav1e.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
librav1e.so.0 \
libstdc++.so.6"

inherit rpm
