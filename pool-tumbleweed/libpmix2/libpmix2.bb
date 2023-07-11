SUMMARY = "PMI-X lib version 1"
DESCRIPTION = "This package contains the shared library used by the PMI-X standard"
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libpmix2-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "5ab6bfe057d4a116152acd7e376982564c5efefb1c54268398e89662f8e10c850e141fd8711dde770207fd3829ed6b0606c160d5d94b4e23df64cfaadf519a63"

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
