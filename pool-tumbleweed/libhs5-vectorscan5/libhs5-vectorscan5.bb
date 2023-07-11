SUMMARY = "Regular expression matching library"
DESCRIPTION = "A fork of Intel's Hyperscan, modified to run on more platforms. \
 \
Vectorscan will follow Intel's API and internal algorithms where possible, \
but will not hesitate to make code changes where it is thought of giving \
better performance or better portability. In addition, the code will be \
gradually simplified and made more uniform and all architecture specific \
-currently Intel- #ifdefs will be removed and abstracted away."
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "libhs5-vectorscan5-5.4.9-2.2.aarch64.rpm"
RPM_HASH = "9e0cf87d3bfdfd0d5579a2e3d75bff0edcf0306c0bdaa670ac10d3edb5042d2eca4837b5724b23aafee37d2172ccc38c1ab5f0f7f5306af65f8c1ab1785f3998"

RPROVIDES:${PN} += "libhs-runtime.so.5 \
libhs.so.5 \
libhs5-vectorscan5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
