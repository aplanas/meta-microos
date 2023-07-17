SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.10.aarch64.rpm"
RPM_HASH = "92e523d24b4d975bf3be186d8ce62aad48824d177a3d2cf0649c7d42bdd6b16879caaf553f08103c8d25d59cbdc935919d9cfdf8c7566d9cb75a73cee6881938"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
