SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python311-PyAudio-0.2.11-3.10.aarch64.rpm"
RPM_HASH = "0d985af922ebb3c9d508a79166c02a1c4f33398cace0ea9bec7f0246938ad69cbfda580fdbb9b4e339ace12e6167a6d2445aed77aabef0f27559ed9aeeb5aad4"

RPROVIDES:${PN} += "python3-PyAudio \
python3.11dist-pyaudio \
python311-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
