SUMMARY = "Erlang Port Mapper daemon"
DESCRIPTION = "The Erlang Port Mapper daemon acts as a name server on all hosts involved in distributed Erlang computations."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-epmd-25.3-1.1.aarch64.rpm"
RPM_HASH = "38b25a3feb1105b029ddbcf96f982cbb9ce293f4fb535bf1bbb7667e0da0761eed2af28377a6ecb7bad49b3983f0f95f5018f70a51e47182c15475cec770d3bb"

RPROVIDES:${PN} += "erlang-epmd erlang-epmd(aarch-64) group(epmd) user(epmd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch erlang fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) systemd sysuser-shadow"

inherit rpm
