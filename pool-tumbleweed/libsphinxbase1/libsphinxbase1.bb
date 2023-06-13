SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "libsphinxbase1-0.8-6.6.aarch64.rpm"
RPM_HASH = "3ad6b1b83c68c731c5b119f989e27bf10896aca8ab3efd3cb5e531689a4816f6e26fa313dbc89f3852ce6b88989dbabd0036e8fd65927ee124f25905bd2bc834"

RPROVIDES:${PN} += "libsphinxbase.so.1()(64bit) \
libsphinxbase1 \
libsphinxbase1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
