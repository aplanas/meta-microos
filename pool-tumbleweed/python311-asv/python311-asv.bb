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

RPM_NAME = "python311-asv-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "2cd13fc4358f5f3d1226520e614d6ed418d84ac45b0a53d158fbdbf4cd68c5b07319b2fa41a536d089816e44a9957d3f080a96a1e49a885fb49bf8c51387be4c"

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
