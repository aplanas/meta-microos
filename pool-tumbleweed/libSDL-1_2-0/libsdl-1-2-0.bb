SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "libSDL-1_2-0-1.2.64-1.5.aarch64.rpm"
RPM_HASH = "fd18cdbae2580eacd75ecc15f55be62fa5dc6aaca57c3e083c5326a7a4fe77e17154e93ec2cbdf1c20990314bdf12fd79040daab93df15bfee60ea32762e31ec"

RPROVIDES:${PN} += "libSDL-1-2-0 \
libSDL-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2-0-0 \
libc.so.6"

inherit rpm
