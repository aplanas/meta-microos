SUMMARY = "Pieces of Psychtoolbox-3 ported to CPython"
DESCRIPTION = "Psychtoolbox is a toolbox for psychophysics experiments. \
The PTB core routines provide access to the display frame buffer and color \
lookup table, reliably synchronize with the vertical screen retrace, support \
sub-millisecond timing, expose raw OpenGL commands, support video playback \
and capture as well as low-latency audio, and facilitate the collection of \
observer responses. Ancillary routines support common needs like color \
space transformations and the QUEST threshold seeking algorithm. \
 \
This module contains pieces of Psychtoolbox ported to CPython."
LICENSE = "AML & BSD-2-Clause & MIT & X11 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.16"

RPM_NAME = "python39-psychtoolbox-3.0.16-2.13.aarch64.rpm"
RPM_HASH = "3a6fbef21a613e56000fd23245229f109faf47c351a55d03218bd4ba3fe5c958a2d0c7c93c0427d965d78f6d8203413821007dc8ffd8c437b270ca1b5823d741"

RPROVIDES:${PN} += "python3.9dist-psychtoolbox \
python39-psychtoolbox \
python3dist-psychtoolbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libasound.so.2 \
libc.so.6 \
libportaudio.so.2 \
libusb-1.0.so.0 \
python-abi"

inherit rpm
