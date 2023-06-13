SUMMARY = "Track earth satellite TLE orbits using up-to-date 2010 version of SGP4"
DESCRIPTION = "This Python package computes the position and velocity of an earth-orbiting \
satellite, given the satellite’s TLE orbital elements from a source like \
Celestrak. It implements the most recent version of SGP4, and is regularly run \
against the SGP4 test suite to make sure that its satellite position predictions \
agree to within 0.1 mm with the predictions of the standard distribution of the \
algorithm. This error is far less than the 1–3 km/day by which satellites \
themselves deviate from the ideal orbits described in TLE files. \
 \
This package compiles the verbatim source code from the official C++ version \
of SGP4. You can call the routine directly, or through an array API that loops \
over arrays of satellites and arrays of times with machine code instead of Python."
LICENSE = "MIT"

PV = "2.22"

RPM_NAME = "python310-sgp4-2.22-1.1.aarch64.rpm"
RPM_HASH = "5921b4976f297666cfd793d4e9da46f54b739927c7ecf4c95edbd62eb4617a1458f6571cd141b202f74050c3738363008cc45baeb9c86d811d059176a15be815"

RPROVIDES:${PN} += "python3-sgp4 \
python3.10dist(sgp4) \
python310-sgp4 \
python310-sgp4(aarch-64) \
python3dist(sgp4)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
python(abi) \
python310-numpy"

inherit rpm
