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

RPM_NAME = "python310-python-rtmidi-1.4.9-3.1.aarch64.rpm"
RPM_HASH = "ab271df80cef637999d98b4ccd5dae6ef46bb9390ad67be9b9a34d9afe870cbce303e3fce55cac84ce60d2d31b9ddeefd2e7bce904084d6273523b1de2158e93"

RPROVIDES:${PN} += "python3.10dist-python-rtmidi \
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
