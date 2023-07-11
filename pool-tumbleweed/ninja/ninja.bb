SUMMARY = "A small build system closest in spirit to Make"
DESCRIPTION = "Ninja is yet another build system. It takes as input the interdependencies \
of files (typically source code and output executables) and orchestrates \
building them, quickly."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "ninja-1.11.1-1.6.aarch64.rpm"
RPM_HASH = "f91199867f715bf0216fe3902adef00d26cace3457c3f87ddab644f53212052243372aca77d1e237754727174d0a5fbc72c1af09e2637bc5b6557f11b1592b78"

RPROVIDES:${PN} += "ninja \
rpm-macro-ninja-build \
rpm-macro-ninja-install \
rpm-macro-ninja-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
