SUMMARY = "Erlang Port Mapper daemon"
DESCRIPTION = "The Erlang Port Mapper daemon acts as a name server on all hosts involved in distributed Erlang computations."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-epmd-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "1abf9cbd4ce1eb2b9b7271ae98dc89b8cf42554353de27f31981577d3c5f18659fa66c22293dcd28370fb2cb7a7bcac2472bbbea4a5425f16bb3cc0e50b5f1b4"

RPROVIDES:${PN} += "erlang-epmd erlang-epmd(aarch-64) group(epmd) user(epmd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch erlang fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) systemd sysuser-shadow"

inherit rpm
