SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python39-pyroomacoustics-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "5618481e758936fedb7062f925d4e38a51a57260367db9bfd2ac170cc115bfc399ed826789d106223690467f5adb51a5e22089e56644128c56c68a08dbfe2088"

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
