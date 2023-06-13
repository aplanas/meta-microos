SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python39-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "e9323554ccacae7e40ec3527ac92002e4481789c73e56bdf812a2b9be78f9335838033397609486cf9df38bbd5f1629e83772ea765c8cb33210e168c9c027549"

RPROVIDES:${PN} += "python3.9dist(pyo) \
python39-pyo \
python39-pyo(aarch-64) \
python3dist(pyo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit) \
libportmidi.so.2()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
python(abi)"

inherit rpm
