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

RPM_NAME = "python311-asv-0.5.1-1.7.aarch64.rpm"
RPM_HASH = "0b8f25a867e19c7520e8a93812cf39e21e8b90d98acfe90a84efb39fdb25e95b4a618e912bba03afebd4e0bff7e99a78870ccab50c2107fae05bb28a93e5a0f1"

RPROVIDES:${PN} += "python3-asv \
python3.11dist-asv \
python311-asv \
python3dist-asv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-six \
update-alternatives"

inherit rpm
