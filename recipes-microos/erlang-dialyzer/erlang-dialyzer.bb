SUMMARY = "A DIscrepany AnaLYZer for ERlang programs"
DESCRIPTION = "A DIscrepany AnaLYZer for ERlang programs."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-dialyzer-25.3-1.1.aarch64.rpm"
RPM_HASH = "d86cd17015f6a2f78d641a2ce1fba0295c17f420b13fa0c4e4d3a9bea55c4f9a8abdd78d2f41383a9570038d7c12cb9ee9f2b79b9beaecc9bf436547ba6e4107"

RPROVIDES:${PN} += "erlang-dialyzer erlang-dialyzer(aarch-64)"
RDEPENDS:${PN} += "erlang erlang-wx graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
