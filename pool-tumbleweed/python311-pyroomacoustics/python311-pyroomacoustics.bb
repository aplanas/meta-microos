SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python311-pyroomacoustics-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "2c59c5fc966be56b2bcc713dc3922964b6ccaa61e455a64a75b57cd25e1480d71b64825dbecd7d2fb379ec5881f615bd25a51c32d4f8b888728f07ef1280cfa7"

RPROVIDES:${PN} += "libroom.cpython-311-aarch64-linux-gnu.so \
python3.11dist-pyroomacoustics \
python311-pyroomacoustics \
python3dist-pyroomacoustics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-Cython \
python311-matplotlib \
python311-numpy \
python311-pybind11 \
python311-samplerate \
python311-scipy \
python311-sounddevice"

inherit rpm
