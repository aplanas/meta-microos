SUMMARY = "Authoritative dns server for A/AAAA container records"
DESCRIPTION = "Aardvark-dns is an authoritative dns server for A/AAAA container records. \
It can forward other requests to configured resolvers."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "aardvark-dns-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "2870eaed5fa272986485d5a8e08de38469d862f373589479e409f4213cd41fbbbb610179ff827ec66cab1ae19a422630cf6797059d015df5bb12537add20a619"

RPROVIDES:${PN} += "aardvark-dns \
aardvark-dns(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
