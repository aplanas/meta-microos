SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python311-pyo-1.0.3-1.15.aarch64.rpm"
RPM_HASH = "ca10504e1f491fe12d06b3f7b6891b139650a1d78cae24caf15343f70af25c7d26288e6f867724d9102951ef899a20fb3bb929f7c02456039cf3dbad2d5c7458"

RPROVIDES:${PN} += "python3-pyo \
python3.11dist-pyo \
python311-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
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
