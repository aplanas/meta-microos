SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python39-pyroomacoustics-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "c732e344c2a8ff78ebffdd22e3592e2ae8921ba526ed1b76d4edc9a45a00da7f32c0747f3a1ceffd1ed6acc91df53b97c9b6946e807e832a351d058ef1e98f07"

RPROVIDES:${PN} += "libroom.cpython-39-aarch64-linux-gnu.so \
python3.9dist-pyroomacoustics \
python39-pyroomacoustics \
python3dist-pyroomacoustics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-Cython \
python39-matplotlib \
python39-numpy \
python39-pybind11 \
python39-samplerate \
python39-scipy \
python39-sounddevice"

inherit rpm
