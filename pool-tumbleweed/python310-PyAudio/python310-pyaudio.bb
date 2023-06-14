SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python310-PyAudio-0.2.11-3.8.aarch64.rpm"
RPM_HASH = "2846775909c0c28072c0e3c4e5dac2386a379039747d9447887d123c249aaf110309861184188c466d7de2ce74d0fe00c1afb5f70f0d694b78a1defd67c50fb1"

RPROVIDES:${PN} += "python3-PyAudio \
python3.10dist-pyaudio \
python310-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
