SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python310-pyroomacoustics-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "003845ef906028c3914767ff03e84ff162ba04b3e1e8966e6ab7582c5a8a7739a3324b8b51d382d44d73aa7a3f801ff30c97cc2e87aed62029964843ef410460"

RPROVIDES:${PN} += "libroom.cpython-310-aarch64-linux-gnu.so \
python3.10dist-pyroomacoustics \
python310-pyroomacoustics \
python3dist-pyroomacoustics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-Cython \
python310-matplotlib \
python310-numpy \
python310-pybind11 \
python310-samplerate \
python310-scipy \
python310-sounddevice"

inherit rpm
