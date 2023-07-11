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

RPM_NAME = "python39-asv-0.5.1-1.7.aarch64.rpm"
RPM_HASH = "622927427b469e33f811520764dd42b7595461d4aeaaf58355e11e050faf90da2ef368804b8799989ed55703651696368c883ac0f25afacdbe8df66abc271016"

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
