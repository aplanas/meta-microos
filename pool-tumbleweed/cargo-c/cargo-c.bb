SUMMARY = "Helper to build and install c-like libraries from Rust"
DESCRIPTION = "The is a cargo applet to build and install C-ABI compatibile dynamic and static \
libraries from Rust. \
 \
It produces and installs a correct pkg-config file, a static library and a \
dynamic library, and a C header to be used by any C (and C-compatible) \
software."
LICENSE = "MIT"

PV = "0.9.15~git0.2d3044b"

RPM_NAME = "cargo-c-0.9.15~git0.2d3044b-2.5.aarch64.rpm"
RPM_HASH = "61da657b278ccc2d2981cb77aba09d60a137b87590f1bd31b9b0e7cb6a9d851963f77572a397961b1ab9e11a528eb712b2e37308bb2bd3f2a0e955bbc9188bd6"

RPROVIDES:${PN} += "cargo-c"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
