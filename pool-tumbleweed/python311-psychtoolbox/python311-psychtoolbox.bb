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

RPM_NAME = "python311-psychtoolbox-3.0.16-2.13.aarch64.rpm"
RPM_HASH = "bc9cc5f1d07afb5f4456641619c57a19f3e74fbb5e5cd8b374765fd6d87ae5e78f3a9640763a6f69842b6de73807340ee478d344d7e5f6cf00fa09c3b688c867"

RPROVIDES:${PN} += "python3-psychtoolbox \
python3.11dist-psychtoolbox \
python311-psychtoolbox \
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
