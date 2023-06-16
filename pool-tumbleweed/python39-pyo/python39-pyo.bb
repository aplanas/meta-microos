SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python39-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "e9323554ccacae7e40ec3527ac92002e4481789c73e56bdf812a2b9be78f9335838033397609486cf9df38bbd5f1629e83772ea765c8cb33210e168c9c027549"

RPROVIDES:${PN} += "python3.9dist-pyo \
python39-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libsndfile.so.1 \
python-abi"

inherit rpm
