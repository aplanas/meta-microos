SUMMARY = "Airspeed Velocity: A Python history benchmarking tool"
DESCRIPTION = "airspeed velocity (asv) is a tool for benchmarking Python packages \
over their lifetime. \
 \
It is designed to benchmark a single project over its lifetime using \
a given suite of benchmarks. The results are displayed in an \
interactive web frontend that requires only a basic static webserver \
to host."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.5.1"

RPM_NAME = "python310-asv-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "2e022af78c058707ca1384b2dacabb278aadcd69f40f29d98c0257d0d6507f43c3d0f086073f787fd2318bc9421ebc3c7e56e79993e3e17d39218c70e46bc875"

RPROVIDES:${PN} += "python3-asv \
python3.10dist(asv) \
python310-asv \
python310-asv(aarch-64) \
python3dist(asv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
