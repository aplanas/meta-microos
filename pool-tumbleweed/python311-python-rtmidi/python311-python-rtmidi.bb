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

RPM_NAME = "python311-python-rtmidi-1.4.9-3.1.aarch64.rpm"
RPM_HASH = "2f4d0f041ade908532ff0eac192095ed10199669557345fe72ec8a28a85a8420bfcbefa25cf62fd2aa979b40802775cfe1c664bda3052cc77330c6c775f9f560"

RPROVIDES:${PN} += "python3-python-rtmidi \
python3.11dist-python-rtmidi \
python311-python-rtmidi \
python3dist-python-rtmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
