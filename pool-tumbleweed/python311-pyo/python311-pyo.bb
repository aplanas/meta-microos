SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python311-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "91ad1ab213bb96fef17afaeedc06616d93344ba3771cc2f12fad163f4a16f5f74d19528db80d82d7467efd096880105127727e70ce33d0f6a884f5ae927b66e4"

RPROVIDES:${PN} += "python3.11dist-pyo \
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
