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

RPM_NAME = "python310-psychtoolbox-3.0.16-2.13.aarch64.rpm"
RPM_HASH = "9f52679cac708f7a166881eed489303c5eb8c5d5ee183c67e1e2b85c57ff07f30e849a74b8e050a04cc47cb520806927a5f7efc1e338ebd7dd26163c5daed6b9"

RPROVIDES:${PN} += "python3.10dist-psychtoolbox \
python310-psychtoolbox \
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
