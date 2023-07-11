SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python310-pyo-1.0.3-1.15.aarch64.rpm"
RPM_HASH = "d47cb68d5b99b668fad0fea06e15c39c4c55c89cfcecde7fbaa51d5e8647072c5eecc8c37428188f4aac35aba873bf8d2694d98786ac9273a807e3989d7e6d00"

RPROVIDES:${PN} += "python3.10dist-pyo \
python310-pyo \
python3dist-pyo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
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
