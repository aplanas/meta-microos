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

RPROVIDES:${PN} += "application() \
application(praat.desktop) \
mimehandler(text/praat-pitch) \
mimehandler(text/praat-textgrid) \
praat \
praat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libglpk.so.40()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libogg.so.0()(64bit) \
libopusfile.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
