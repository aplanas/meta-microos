SUMMARY = "Core partio libraries"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libpartio1-1.14.6-1.9.aarch64.rpm"
RPM_HASH = "b51ebe0988a60027f7f0a869be3ef28ea259032f20af6af569746e4b6dbcf118c08b93274fa93f5399b8a20137da1d652dbfd3b9fceb6786ab2542cedbe8d47f"

RPROVIDES:${PN} += "libpartio.so.1()(64bit) \
libpartio1 \
libpartio1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
