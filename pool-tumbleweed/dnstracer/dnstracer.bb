SUMMARY = "Trace a DNS record to its start of authority"
DESCRIPTION = "Dnstracer determines where a given Domain Name Server (DNS) gets its \
information from, and follows the chain of DNS servers back to the \
servers which know the data."
LICENSE = "BSD-2-Clause"

PV = "1.10"

RPM_NAME = "dnstracer-1.10-1.8.aarch64.rpm"
RPM_HASH = "66b8a68414de50d7745d492fe6687116b0b695d0603dc37e2a68e37bfe4357a44a1ef79aa1a3290b48171c8348b7223cc1083a60f86f8cb9c82dc31a04cb2610"

RPROVIDES:${PN} += "dnstracer \
dnstracer(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
