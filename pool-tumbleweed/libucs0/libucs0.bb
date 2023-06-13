SUMMARY = "Infiniband Unicified Communication Services"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucs0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "5dbc86d6a1c192de821e1745fbea86d9458cccabde28140e96ff63cc242038416e17e0544fb4887dd727e2131261f8a519dc8dd88df954898f35bb6c1ca09372"

RPROVIDES:${PN} += "libucs.so.0()(64bit) \
libucs0 \
libucs0(aarch-64) \
libucs_signal.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libucm.so.0()(64bit)"

inherit rpm
