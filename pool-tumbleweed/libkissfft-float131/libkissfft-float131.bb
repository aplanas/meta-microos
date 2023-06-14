SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "libkissfft-float131-131.1.0-2.3.aarch64.rpm"
RPM_HASH = "05333acda07dbd791c670ba6670ebd62bfa59c38972e7f2a1ed3bc95614764d0996b28069b2a57e652abdb5a20028f71e392f2524d6561e2052636e99372df1d"

RPROVIDES:${PN} += "libkissfft-float.so.131 \
libkissfft-float131"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
