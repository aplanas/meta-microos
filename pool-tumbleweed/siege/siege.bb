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

RPM_NAME = "siege-4.1.6-1.6.aarch64.rpm"
RPM_HASH = "6824830d2e6b5691532a277786221225fbc2f282faf87958d95639d0316608713524fe5040b30966fa0f60654d2f6c571670688ed70a31af6009808e8665f50f"

RPROVIDES:${PN} += "config-siege \
siege"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
