SUMMARY = "Static analysis tool for C"
DESCRIPTION = "Smatch is a static analysis tool for C. Most of the checks are for the linux \
kernel. Please write checks for your project. It's fun and easy!"
LICENSE = "GPL-2.0-only"

PV = "1.73+20230517"

RPM_NAME = "smatch-1.73+20230517-1.1.aarch64.rpm"
RPM_HASH = "58c32d160f21dab7fb231c3ba674640a8f94300b1a0704e0de7841fd091cc88dc205c2ae6e5012c2a2352b0564f2899a1fc4039a7603097cafec6731a44b56cb"

RPROVIDES:${PN} += "smatch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsqlite3.so.0"

inherit rpm
