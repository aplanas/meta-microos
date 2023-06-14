SUMMARY = "Text-mode music player"
DESCRIPTION = "C* Music Player is a small and fast text mode (ncurses-based) music player \
for Unix-like operating systems."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "a127a1569fb5c7ee04a6c0e6256673abadc0a80ca7c8eb16478d835e836b560be403c5ae14284c5655cddda382e4781475bc9b22c0e05db2a89a019a2957086e"

RPROVIDES:${PN} += "cmus \
config-cmus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdiscid.so.0 \
libm.so.6 \
libncursesw.so.6 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
