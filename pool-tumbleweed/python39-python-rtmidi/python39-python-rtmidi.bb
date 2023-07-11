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

RPM_NAME = "python39-python-rtmidi-1.4.9-3.1.aarch64.rpm"
RPM_HASH = "a43f7513fd40b5028d4b35d3b43826b45a673f737915ec826954c73eae1476dc204a4ab56eb8851657d4d3694078c09c4c5f921cbbe3560680b09a03705deac8"

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
