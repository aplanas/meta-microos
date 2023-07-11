SUMMARY = "Erlang Port Mapper daemon"
DESCRIPTION = "The Erlang Port Mapper daemon acts as a name server on all hosts involved in distributed Erlang computations."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-epmd-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "d5364acb3015a25be30dd13c5741ca94cda416a0a58ab010793dfea38c0fe567b1012cd5ecc9cfd547578e9ff0c45cea944845e23c9733502b23717560d43031"

RPROVIDES:${PN} += "erlang-epmd \
group-epmd \
user-epmd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
erlang \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd.so.0 \
systemd \
sysuser-shadow"

inherit rpm
