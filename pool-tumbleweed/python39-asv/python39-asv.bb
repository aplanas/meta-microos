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

RPM_NAME = "python39-asv-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "44438c5c5104229e959c1461661e66a4a2961520f23512aa6515a4d3a6113b7391c96af785bce5b1cad4cc974147c633403492193949049de625c26f9b5c86bb"

RPROVIDES:${PN} += "python3.9dist(asv) \
python39-asv \
python39-asv(aarch-64) \
python3dist(asv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-six \
update-alternatives"

inherit rpm
