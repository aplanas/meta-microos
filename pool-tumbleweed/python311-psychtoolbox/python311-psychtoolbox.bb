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

RPM_NAME = "python311-psychtoolbox-3.0.16-2.12.aarch64.rpm"
RPM_HASH = "747b74ef67d241513add1a0ebab87b5479912f7f328f7229b6fde5a1bc052b27232e89f3cdd03f08e634d756c5b0f1c56201a2a7ecd1999f24f7fc9ac87ad821"

RPROVIDES:${PN} += "python3.11dist(psychtoolbox) \
python311-psychtoolbox \
python311-psychtoolbox(aarch-64) \
python3dist(psychtoolbox)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libportaudio.so.2()(64bit) \
libusb-1.0.so.0()(64bit) \
python(abi)"

inherit rpm
