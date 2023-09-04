SUMMARY = "HTTP Regression Testing/Benchmarking Utility"
DESCRIPTION = "Siege is a regression test and benchmark utility. It can stress test a \
single URL with a user defined number of simulated users, or it can read \
many URLs into memory and stress them simultaneously. The program reports \
the total number of hits recorded, bytes transferred, response time, \
concurrency, and return status. Siege supports HTTP/1.0 and 1.1 protocols, \
GET and POST directives, cookies, transaction logging, and basic \
authentication. Its features are configurable on a per user basis. Since \
3.0.0 it also supports FTP."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.6"

RPM_NAME = "siege-4.1.6-1.7.aarch64.rpm"
RPM_HASH = "15beb8a27c54cf2c6f32b4e67d8bf6ec1007ea2d215e094d213587e74a91aa88dff1bb75c2c559138915870283bd969c31c5eaebbf2fa823b565b175e966d9e9"

RPROVIDES:${PN} += "config-siege \
siege"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
