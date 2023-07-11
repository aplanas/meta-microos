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

RPM_NAME = "psl-0.21.2-1.3.aarch64.rpm"
RPM_HASH = "54f143c7d69c96a0be76255d20d43000642fa54eb4242dda45445b9360aa556886f5673c0e36c2ab409f3ba78b5ec2e4cac228cf1e7cc73050930247ecf66f89"

RPROVIDES:${PN} += "psl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpsl.so.5"

inherit rpm
