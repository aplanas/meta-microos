SUMMARY = "PMI-X lib version 1"
DESCRIPTION = "This package contains the shared library used by the PMI-X standard"
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libpmix2-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "c3bb57c8c1b06bcaac658cc01262780d065e3c1bc71695e3fc8f83d1e07b2155b134b27db682cffff223b041c146bca6c2c7386987f4758129a4c41a624797b8"

RPROVIDES:${PN} += "libpmix.so.2 \
libpmix2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libhwloc.so.15 \
pmix-plugins \
pmix-runtime-config"

inherit rpm
