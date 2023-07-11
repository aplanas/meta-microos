SUMMARY = "Replacement for ls written in Rust"
DESCRIPTION = "exa is a replacement for ls written in Rust. \
With similar but not identical options."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-0.10.1-3.5.aarch64.rpm"
RPM_HASH = "12a746e515d6f40ada4ad57451b049e50e64c990d35e2133519bafb6bbe8eecf26bae1a4139af883a5883da7b4a678bd45c0a8db91deb44392d1838790ea054e"

RPROVIDES:${PN} += "exa"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libz.so.1"

inherit rpm
