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

RPM_NAME = "python39-python-rtmidi-1.4.9-2.4.aarch64.rpm"
RPM_HASH = "35292e7d5bc0be0677e74c4ff9aed339b85dda01877505f42cfebdb9a73d1402738bbb50a927a83d2cf282f5069f46ad74c83428acd47b749e969b7a479efe20"

RPROVIDES:${PN} += "python3.9dist-python-rtmidi \
python39-python-rtmidi \
python3dist-python-rtmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
