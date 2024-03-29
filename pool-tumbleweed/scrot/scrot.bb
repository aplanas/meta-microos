SUMMARY = "Screenshot Capture Utility"
DESCRIPTION = "A nice and straightforward screen capture utility implementing \
the dynamic loaders of imlib2."
LICENSE = "SUSE-Scrot"

PV = "1.8.1"

RPM_NAME = "scrot-1.8.1-1.2.aarch64.rpm"
RPM_HASH = "8ae0e3f23bb7b74b33c090d297c16c441695b30bca3fc3cb7105351805e5b3d4ed52516d594f1d9bebf58c05809de5fcfbabc14162b76bd4fc82f7b20294e51c"

RPROVIDES:${PN} += "scrot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libbsd.so.0 \
libc.so.6"

inherit rpm
