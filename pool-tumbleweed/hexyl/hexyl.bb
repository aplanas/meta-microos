SUMMARY = "A command-line hex viewer"
DESCRIPTION = "hexyl is a simple hex viewer for the terminal. It uses a colored output \
to distinguish different categories of bytes (NUL bytes, printable \
ASCII characters, ASCII whitespace characters, other ASCII characters \
and non-ASCII)."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "hexyl-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "8642da798f41b14d4f3d7e7e760e4ff5465c54372600a4259c82968bb3576eebce25a483e09a97f7a751b3afc22da6224ed41ceaa0df4e31fcfb0526521c9449"

RPROVIDES:${PN} += "hexyl \
hexyl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
