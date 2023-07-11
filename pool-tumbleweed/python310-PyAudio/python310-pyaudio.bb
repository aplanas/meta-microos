SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python310-PyAudio-0.2.11-3.10.aarch64.rpm"
RPM_HASH = "f7135137c73e7459c96007c23f992b5728e7d90cdd8cfa4f06c0d93411df9db5541443f57386570a15a499df9213c18047849d779c0c8866b11f9d39cd5017a4"

RPROVIDES:${PN} += "python3.10dist-pyaudio \
python310-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
