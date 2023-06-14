SUMMARY = "Core partio libraries"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libpartio1-1.14.6-1.9.aarch64.rpm"
RPM_HASH = "b51ebe0988a60027f7f0a869be3ef28ea259032f20af6af569746e4b6dbcf118c08b93274fa93f5399b8a20137da1d652dbfd3b9fceb6786ab2542cedbe8d47f"

RPROVIDES:${PN} += "libpartio.so.1 \
libpartio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
