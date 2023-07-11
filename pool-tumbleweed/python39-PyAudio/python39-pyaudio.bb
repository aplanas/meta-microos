SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python39-PyAudio-0.2.11-3.10.aarch64.rpm"
RPM_HASH = "afad72f8747b9979283bc0e50eb54456fa72bb989c87c2108e414e5c1f9c9eb92eec6cc79d5f3a596f60adf28b8b281283c1ac67b92b14d763359c73233cb2df"

RPROVIDES:${PN} += "python3.9dist-pyaudio \
python39-PyAudio \
python3dist-pyaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportaudio.so.2 \
python-abi"

inherit rpm
