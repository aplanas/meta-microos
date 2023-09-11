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

RPM_NAME = "python39-asv-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "98803f0e6b0fd1d4732da6903accba5149214c18715cdde0c8324569d64b0127346090c8723b0711237cef8b8b64da1dbb007609282957cfea3b1877ae70ed48"

RPROVIDES:${PN} += "python3.9dist-asv \
python39-asv \
python3dist-asv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-six \
update-alternatives"

inherit rpm
