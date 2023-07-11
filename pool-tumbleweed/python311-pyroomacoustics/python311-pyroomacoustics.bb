SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python311-pyroomacoustics-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "01b70002d0153ca85c0a457b4fe9010fbcff50bb7bb7a6baa2db976f421e83df381f1acce9737261f3dcd77d5e3da1d42a1e0ac7077a6baa77941f283d2eceae"

RPROVIDES:${PN} += "libroom.cpython-311-aarch64-linux-gnu.so \
python3-pyroomacoustics \
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
