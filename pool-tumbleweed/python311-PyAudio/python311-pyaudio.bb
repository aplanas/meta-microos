SUMMARY = "Python Bindings for PortAudio v19"
DESCRIPTION = "PyAudio provides Python bindings for PortAudio v19, the cross-platform audio I/O library. \
With PyAudio, you can easily use Python to play and record audio streams on a variety \
of platforms (e.g., GNU/Linux, Microsoft Windows, and Mac OS X)."
LICENSE = "MIT"

PV = "0.2.11"

RPM_NAME = "python311-PyAudio-0.2.11-3.8.aarch64.rpm"
RPM_HASH = "2db5342dd3333593931679c44f2f6bd21b82b2d0d69af498377cca7721952b5b0908dec94587a8180af65da005c3329df1c8bf8565ff3e223e9b7fdb0c547139"

RPROVIDES:${PN} += "python3.11dist(pyaudio) \
python311-PyAudio \
python311-PyAudio(aarch-64) \
python3dist(pyaudio)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libportaudio.so.2()(64bit) \
python(abi)"

inherit rpm
