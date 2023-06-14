SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python39-PyAudio-0.2.11-3.8.aarch64.rpm"
RPM_HASH = "cfeb1354a2e1c169262db7045616f4379217c3a96cf6ccbb71d10136397f66df160934c6ee334c17b7f568991be7d8bd7a41160f490b22452461769a1d8e427c"

RPROVIDES:${PN} += "python3.9dist-pyaudio \
python39-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
