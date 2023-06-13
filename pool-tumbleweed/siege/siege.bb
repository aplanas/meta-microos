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

RPM_NAME = "siege-4.1.6-1.4.aarch64.rpm"
RPM_HASH = "78ba701f78a09fe46be5cc26dfc81152b3a152148d8d14ff2db65408a98b323af4b534384dfa52d4b051f4714a797ec2878b4287c3433d912c2da5119158b9b4"

RPROVIDES:${PN} += "config(siege) \
siege \
siege(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
