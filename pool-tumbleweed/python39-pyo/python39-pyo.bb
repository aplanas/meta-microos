SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python39-pyo-1.0.3-1.15.aarch64.rpm"
RPM_HASH = "eb439a67bcfaf7810dfa66d3312c9826db8bcb47997143a02e87fa2a5a5b57b2a9d77ade1d3d73685bb4da3a0b429b082344b303aa5f314bc089bd826cf76c77"

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
