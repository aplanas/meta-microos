SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "The eSpeak NG (Next Generation) Text-to-Speech program is a speech \
synthesizer that supports 100 languages and accents. It is based \
on the eSpeak engine created by Jonathan Duddington. It uses \
spectral formant synthesis by default which sounds robotic, but can \
be configured to use Klatt formant synthesis or MBROLA to give it a \
more natural sound."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-1.51-1.9.aarch64.rpm"
RPM_HASH = "78b2c1cc5a447fde6e6ce04cad9debef95440dd73ac30946226a5d8d795a7b31d021b36f57a1e1fc7d745ce7a229ff965e12b484e697dd2ef8019091466359fd"

RPROVIDES:${PN} += "espeak-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak-ng.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpcaudio.so.0 \
libstdc++.so.6"

inherit rpm
