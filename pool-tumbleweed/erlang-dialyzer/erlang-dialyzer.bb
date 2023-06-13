SUMMARY = "A DIscrepany AnaLYZer for ERlang programs"
DESCRIPTION = "A DIscrepany AnaLYZer for ERlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-dialyzer-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "cd2ce133d568860b8a1b8b540f6ca20e95231587e0f0168e24268aa1efb6d5234f46a133b07d027f4a8279b69d863a4edc5c7e01e6ed46b2c0fb8dfe085d8ee2"

RPROVIDES:${PN} += "erlang-dialyzer \
erlang-dialyzer(aarch-64)"

RDEPENDS:${PN} += "erlang \
erlang-wx \
graphviz \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
