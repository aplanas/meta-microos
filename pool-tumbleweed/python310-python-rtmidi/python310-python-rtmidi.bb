SUMMARY = "Python binding for the RtMidi C++ library"
DESCRIPTION = "RtMidi is a set of C++ classes which provides an API for realtime \
MIDI I/O across Linux (ALSA & JACK), macOS (CoreMIDI & JACK), \
and Windows (MultiMedia System) operating systems. \
 \
python-rtmidi is a Python binding for RtMidi implemented using \
Cython and provides a thin wrapper around the RtMidi C++ interface. \
The API is basically the same as the C++ one but with the naming \
scheme of classes, methods and parameters adapted to the Python \
PEP-8 conventions and requirements of the Python package naming \
structure."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python310-python-rtmidi-1.4.9-2.4.aarch64.rpm"
RPM_HASH = "d1994cf02f64f109dc477ac208697b79b5c7dc1a99bd62b76a3f676b857a32b493309ad8bc860a70b3754ee391ada32d7c94cae28f14f0c8019e9bd39b1bc5df"

RPROVIDES:${PN} += "python3-python-rtmidi \
python3.10dist-python-rtmidi \
python310-python-rtmidi \
python3dist-python-rtmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
