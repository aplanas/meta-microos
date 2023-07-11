SUMMARY = "Records nondeterministic executions and debugs them deterministically"
DESCRIPTION = "This program aspires to be your primary debugging tool, enhancing gdb. It \
also provides efficient reverse execution under gdb. Set breakpoints and \
data watchpoints and quickly reverse-execute to where they were hit."
LICENSE = "MIT"

PV = "5.6.0"

RPM_NAME = "rr-5.6.0-4.1.aarch64.rpm"
RPM_HASH = "ad5716cca9f295b8831c02e9cd3ef732a3f27f039ff404cd3202f7520eee30150e7832abb5a22bf5f6961e9d86bf30f4d7b1382a8e6da671ac7999b020ebd590"

RPROVIDES:${PN} += "librraudit.so \
librrpreload.so \
rr"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-0.10.4.so \
libgcc-s.so.1 \
libkj-0.10.4.so \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
