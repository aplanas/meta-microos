SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.4.aarch64.rpm"
RPM_HASH = "e49aae165842a47aed9ae1e168fe4b47f21677b6e580c54e410f705479969cfe4dbc59e52b1d6aa2e62e3a6f9a678e15e92690d9541ffd2e992164f47eac9d54"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
