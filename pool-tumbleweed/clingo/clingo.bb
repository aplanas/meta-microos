SUMMARY = "A grounder and solver for logic programs"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). ASP offers a simple and powerful modeling language to describe \
combinatorial problems as logic programs. The clingo system then takes \
such a logic program and computes answer sets representing solutions \
to the given problem."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "clingo-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "6e94550d6b738b7837fb1c7e17f5b72848c16f16dd5548cd08e495f8d37758ca6d05c0caf8443d614d652729796a7f4faad532e4b6a096670280d3c50e302c6c"

RPROVIDES:${PN} += "clingo"

RDEPENDS:${PN} += "libc.so.6 \
libclingo.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6"

inherit rpm
