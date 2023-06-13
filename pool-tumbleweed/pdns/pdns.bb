SUMMARY = "Authoritative-only nameserver"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. Furthermore, PowerDNS \
interfaces with almost any database."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "941a9630872b48fbeab73d943812dfa309ea299f76720de25421f8f78850a2384d91262b14218df63b9a083ec133c3da651f4c76b95b108c0dc58f44b822c33c"

RPROVIDES:${PN} += "bundled(ipcrypt) \
bundled(json11) \
bundled(lmdb-safe) \
bundled(luawrapper) \
bundled(protozero) \
bundled(yahttp) \
config(pdns) \
libbindbackend.so()(64bit) \
libpipebackend.so()(64bit) \
pdns \
pdns(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libp11-kit.so.0()(64bit) \
libsodium.so.23()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libyaml-cpp.so.0.7()(64bit) \
pdns-common"

inherit rpm
