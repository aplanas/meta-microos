SUMMARY = "Airspeed Velocity: A Python history benchmarking tool"
DESCRIPTION = "airspeed velocity (asv) is a tool for benchmarking Python packages \
over their lifetime. \
 \
It is designed to benchmark a single project over its lifetime using \
a given suite of benchmarks. The results are displayed in an \
interactive web frontend that requires only a basic static webserver \
to host."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.6.0"

RPM_NAME = "python310-asv-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "2bde3115cd92e911c18b4407e0f2aec600105689dc7fb35307246b3a4293af3a5a1ff3d8c7a3be5efec7f7cf2decad90691a2695a35c06339965c687632950e6"

RPROVIDES:${PN} += "python3.10dist-asv \
python310-asv \
python3dist-asv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-six \
update-alternatives"

inherit rpm
