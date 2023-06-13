SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libefa1-45.0-1.1.aarch64.rpm"
RPM_HASH = "68b719332a929df1c0dfbf37b382e814edd7937e69a7f857c509b677de3e7cf288cbec6ca7770334dad608ec98f9917187cde72ef0db8587071c107f29c77c28"

RPROVIDES:${PN} += "libefa.so.1()(64bit) \
libefa1 \
libefa1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
