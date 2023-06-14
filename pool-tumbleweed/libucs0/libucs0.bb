SUMMARY = "Infiniband Unicified Communication Services"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucs0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "5dbc86d6a1c192de821e1745fbea86d9458cccabde28140e96ff63cc242038416e17e0544fb4887dd727e2131261f8a519dc8dd88df954898f35bb6c1ca09372"

RPROVIDES:${PN} += "libucs-signal.so.0 \
libucs.so.0 \
libucs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnuma.so.1 \
libucm.so.0"

inherit rpm
