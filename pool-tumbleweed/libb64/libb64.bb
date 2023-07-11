SUMMARY = "Base64 Encoding/Decoding Routines"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libb64-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "0a1a59fa3fdb200d0f30adac0a7c6e5aba6fb2109015a731ad4dd73b0dac1c866f0188b126a3af72520375e76f7416338cf89a19cec084e4ee9ea20e4ce8326c"

RPROVIDES:${PN} += "libb64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
