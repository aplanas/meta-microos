SUMMARY = "Dateutils functions for matlab and octave"
DESCRIPTION = "Dateutils can be used from within matlab or ocatave."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "dateutils-octave-0.4.10-2.3.aarch64.rpm"
RPM_HASH = "3b6ba31a64d37d92b880baa20d5d564c80747079a9c99c175905cc58b18d767ea8f89f77f0de380f41b4189a6d044e3a6fd4f7c57630efe5c1ca4e734c54b6b8"

RPROVIDES:${PN} += "dateutils-octave \
dateutils-octave(aarch-64)"
RDEPENDS:${PN} += "dateutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
octave"

inherit rpm
