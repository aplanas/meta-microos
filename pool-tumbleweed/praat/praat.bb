SUMMARY = "Phonetics by computer"
DESCRIPTION = "Praat is an open-software tool for the analysis of speech in phonetics. \
Through its graphical interface, several speech analysis functionalities \
are available: spectrograms, cochleograms, and pitch and formant extraction. \
Articulatory synthesis, as well as synthesis from pitch, formant, and \
intensity are also available. Other features are segmentation, labelling \
using the phonetic alphabet, and computation of statistics. \
Praat is configurable and extensible through its own scripting language and has \
provisions for communicating with other programs."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.10"

RPM_NAME = "praat-6.3.10-1.1.aarch64.rpm"
RPM_HASH = "0137ebd78bdfec391273fcab8ce321008973632b9996f909efb7d3c5feabc9275d03ea0b22d94da351d0f40899fb932cdd937244dacbb4cb372c3d3219b82165"

RPROVIDES:${PN} += "praat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libglpk.so.40 \
libgobject-2.0.so.0 \
libgsl.so.27 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libogg.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3"

inherit rpm
