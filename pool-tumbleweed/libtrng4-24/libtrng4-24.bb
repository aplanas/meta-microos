SUMMARY = "A Random Number Generator Library"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
Key features: \
* compatible with the C++11 random number facility as defined in \
  <random> \
* implements various pseudo random number algorithms \
* supports multiple streams of random numbers for parallel \
  (multi-threaded) applications \
* may be used with any threading library or MPI \
* pseudo random numbers can be sampled from many different distributions"
LICENSE = "BSD-3-Clause"

PV = "4.24"

RPM_NAME = "libtrng4-24-4.24-2.8.aarch64.rpm"
RPM_HASH = "578a8342362e5984ec01f17f977eb8943f07e7c068e7e7fe8f69954e420cb79dde479c2416a4279f309578e9f00c39f397bb5cd7a574ce09d672a30d7fcc133a"

RPROVIDES:${PN} += "libtrng4-24 \
libtrng4.so.24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
