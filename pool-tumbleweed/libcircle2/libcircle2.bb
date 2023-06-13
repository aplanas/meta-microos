SUMMARY = "A library used to distribute workloads"
DESCRIPTION = "A simple interface for processing workloads using an automatically distributed global queue."
LICENSE = "BSD-3-Clause-LBNL"

PV = "0.3"

RPM_NAME = "libcircle2-0.3-1.9.aarch64.rpm"
RPM_HASH = "88de384c9ee28be430cc7e08e19e46c3a630289cf6a3fd3ec9dca4bd045121db44064d3415e6bc8fd45788ab6b17fdd57be3f7ca81a50f35b2709245a1b73b51"

RPROVIDES:${PN} += "libcircle.so.2()(64bit) \
libcircle2 \
libcircle2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit) \
openmpi4-libs"

inherit rpm
