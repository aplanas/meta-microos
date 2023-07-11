SUMMARY = "GNUstep Objective-C Runtime"
DESCRIPTION = "The GNUstep Objective-C runtime is designed as a drop-in replacement for the \
GCC runtime.  It supports both a legacy and a modern ABI, allowing code \
compiled with old versions of GCC to be supported without requiring \
recompilation.  The modern ABI adds the following features: \
 \
- Non-fragile instance variables. \
- Protocol uniquing. \
- Object planes support. \
- Declared property introspection."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "libobjc4_6-2.1-2.4.aarch64.rpm"
RPM_HASH = "1a8e2dec1b8bf8ad04daf160cd91ca9687dbec3afa518750dcab828184162be6236342086eba41a446458fc52473da0f8773b547f7c227a7c0ec597ae5a152ff"

RPROVIDES:${PN} += "libobjc.so.4.6 \
libobjc4-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
