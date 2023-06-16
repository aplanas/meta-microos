SUMMARY = "General-purpose programming language and runtime environment"
DESCRIPTION = "Erlang is a general-purpose programming language and runtime \
environment. Erlang has built-in support for concurrency, distribution \
and fault tolerance. Erlang is used in several large telecommunication \
systems from Ericsson."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "e36aa5e9ba1cc12449aa5cbcdb88df3f85b204a811d3b1fea4488d92c2bd4205813fa44d14d1af0528addb5d88351f3caaa1c2dbcaf0cedbbe9debac240553c1"

RPROVIDES:${PN} += "erlang \
rpm-macro--erldir \
rpm-macro--erllibdir \
rpm-macro-erlang-app-name \
rpm-macro-erlang-app-vsn \
rpm-macro-erlang-dir \
rpm-macro-erlang-libdir"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang-epmd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
