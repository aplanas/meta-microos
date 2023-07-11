SUMMARY = "Algorithmic Differentiation Library for C/C++"
DESCRIPTION = "ADOL-C (Automatic Differentiation by OverLoading in C++) facilitates \
the evaluation of first and higher derivatives of vector functions \
written in C or C++. The resulting derivative evaluation routines may \
be called from C/C++, Fortran, or any other language that can be \
linked with C. \
 \
The numerical values of derivative vectors are obtained free of \
truncation errors at a small multiple of the run time and randomly \
accessed memory of the given function evaluation program."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "libadolc2-2.7.2-2.4.aarch64.rpm"
RPM_HASH = "336d549f139231f899d8123e49929bd38258a48a2fc8c7354ce65b78791bd6cb8e1b74115603d925866c445c835436c77fb07156b9e827b051367d1b545806ca"

RPROVIDES:${PN} += "libadolc.so.2 \
libadolc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libColPack.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
