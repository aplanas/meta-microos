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

RPM_NAME = "libhs5-vectorscan5-5.4.9-2.1.aarch64.rpm"
RPM_HASH = "fe92bedf770c83536108ea8c2f6672a8281b08150aff29363064f7dab4d4faeb0d951bf581db142788a0c134bc89c9ea1eb6ca9dd4b1fd202cabacb6d1ca3b5e"

RPROVIDES:${PN} += "libhs.so.5()(64bit) \
libhs5-vectorscan5 \
libhs5-vectorscan5(aarch-64) \
libhs_runtime.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
