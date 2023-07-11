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

RPM_NAME = "python310-asv-0.5.1-1.7.aarch64.rpm"
RPM_HASH = "81ebb41c77f268e863ad59775e60a885d33a2a7c6719b44d204b01c51cfdfd70441b738fad80fe45990c33cbe046b53f884f740366c85207d06a3a8390913fd7"

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
