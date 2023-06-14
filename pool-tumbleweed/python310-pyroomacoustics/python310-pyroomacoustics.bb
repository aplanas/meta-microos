SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python310-pyroomacoustics-0.7.3-1.5.aarch64.rpm"
RPM_HASH = "070c794e94832ae57570f3bae2d8b1023c500627f7bbf85f2c72fb7afccb4120baf66200251fda855094fe6aedbc6db94241dc335031c3a5d15117d0c61eab5b"

RPROVIDES:${PN} += "libroom.cpython-310-aarch64-linux-gnu.so \
python3-pyroomacoustics \
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
