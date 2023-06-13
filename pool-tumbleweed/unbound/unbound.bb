SUMMARY = "Validating, recursive, and caching DNS(SEC) resolver"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
The C implementation of Unbound is developed and maintained by NLnet \
Labs. It is based on ideas and algorithms taken from a java prototype \
developed by Verisign labs, Nominet, Kirei and ep.net. \
 \
Unbound is designed as a set of modular components, so that also \
DNSSEC (secure DNS) validation and stub-resolvers (that do not run \
as a server, but are linked into an application) are easily possible."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "196416edf77f33f5ad951c61821685edbea2ca4388dd1f8042494112a53c7ebac67dd634e6bb614a34c3ac5f3e610f9f08afdcc8ccfd06e85aa92d25a959a5d1"

RPROVIDES:${PN} += "config(unbound) \
unbound \
unbound(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ldns \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libevent-2.1.so.7()(64bit) \
libnghttp2.so.14()(64bit) \
libprotobuf-c.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libunbound.so.8()(64bit) \
openssl \
sudo \
systemd"

inherit rpm
