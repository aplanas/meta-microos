SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python310-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "6d33bdc97a8072043897b04705f1e8c419a0393edfe910d34bd6a1cc994224e9f0553164d56fd66357deddf6776ee66b946d6a1e0091683ca8ba47b0fa7c8bbd"

RPROVIDES:${PN} += "python3-pyo \
python3.10dist-pyo \
python310-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
