SUMMARY = "Network tool to concatenate and redirect sockets"
DESCRIPTION = "Ncat is a networking utility which will read and write data across a \
network from the command line. It uses both TCP and UDP for \
communication and provides network connectivity to other applications \
and users."
LICENSE = "GPL-2.0-or-later"

PV = "7.93"

RPM_NAME = "ncat-7.93-1.3.aarch64.rpm"
RPM_HASH = "90470ebe5421a2de5069685c70141db6f7c48d9418d86cfd40356982141008d1903bd06173e62d3a4a235d14552e757a893516cb8ea196b78ecdf8372e589d1d"

RPROVIDES:${PN} += "config(ncat) \
ncat \
ncat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
liblua5.3.so.5()(64bit) \
libpcap.so.1()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
