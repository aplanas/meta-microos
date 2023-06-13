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

RPM_NAME = "python311-asv-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "0e3191d3a10899cc2f31142d3ecf336b439f0e5d849fb4cafc217aa971d1af01d0c7f3b2bdb364df129c3d0d8fb757698deb63f0182649e5e0be9902e9bfc758"

RPROVIDES:${PN} += "python3.11dist(asv) \
python311-asv \
python311-asv(aarch-64) \
python3dist(asv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-six \
update-alternatives"

inherit rpm
