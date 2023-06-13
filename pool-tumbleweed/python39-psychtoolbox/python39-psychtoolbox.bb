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

RPM_NAME = "python39-psychtoolbox-3.0.16-2.12.aarch64.rpm"
RPM_HASH = "35f0438e710743494b5568b2743914c6a426e87a0bdf914c1a35703b2e5fca6d21c12074b321fbb2fca4f92c032e972cc2edc8e13361e632f30a879add612b56"

RPROVIDES:${PN} += "python3.9dist(psychtoolbox) \
python39-psychtoolbox \
python39-psychtoolbox(aarch-64) \
python3dist(psychtoolbox)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libportaudio.so.2()(64bit) \
libusb-1.0.so.0()(64bit) \
python(abi)"

inherit rpm
