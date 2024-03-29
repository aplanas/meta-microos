SUMMARY = "Vorbis input plugin for the C* Music Player"
DESCRIPTION = "This package provides Vorbis input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-vorbis-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "4863aca78de22b26082b52e4c851465848476c6dcdf9edb22eb1dad2731bab887a8712815e065c5b47e60e0964a73b72ce547aea34fd71f76728030ac9db799f"

RPROVIDES:${PN} += "cmus-plugin-vorbis"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvorbisfile.so.3"

inherit rpm
