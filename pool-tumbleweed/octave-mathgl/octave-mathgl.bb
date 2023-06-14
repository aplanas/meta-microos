SUMMARY = "Octave interface for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides Octave interface for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "octave-mathgl-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "b950f6a37afa09a5000540ac76af2417323ad23be9c0415427246db27040b50b2c8610604be37ef191d2ff9362b52aa5373c05ecc0692649c20daed90b3115e1"

RPROVIDES:${PN} += "octave-mathgl"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6 \
octave-cli"

inherit rpm
