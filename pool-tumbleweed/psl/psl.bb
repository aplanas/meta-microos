SUMMARY = "Commandline utility to explore the Public Suffix List"
DESCRIPTION = "This package contains a commandline utility to explore the Public Suffix List, \
for example it checks if domains are public suffixes, checks if cookie-domain \
is acceptable for domains and so on. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "psl-0.21.2-1.2.aarch64.rpm"
RPM_HASH = "ca6abac67f891dd1d26a59907a102b267ecccfc570e55e2b2d637fe584b2d068ecd6c66eee786c086fa387ff761ca410e0dddeb506d4f1b29aab4702aa527811"

RPROVIDES:${PN} += "psl \
psl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpsl.so.5()(64bit)"

inherit rpm
