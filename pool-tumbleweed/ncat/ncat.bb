SUMMARY = "Network tool to concatenate and redirect sockets"
DESCRIPTION = "Ncat is a networking utility which will read and write data across a \
network from the command line. It uses both TCP and UDP for \
communication and provides network connectivity to other applications \
and users."
LICENSE = "GPL-2.0-or-later"

PV = "7.93"

RPM_NAME = "ncat-7.93-1.4.aarch64.rpm"
RPM_HASH = "75faa1bdd3451da03623675e274af36acfd04013150272bb89100bc3f73ca58ca15599cd622c18e96e93ca4a1e4ad5f79eb8a5a14d60f2ff7ff7208a015ad58c"

RPROVIDES:${PN} += "config-ncat \
ncat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblua5.3.so.5 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
