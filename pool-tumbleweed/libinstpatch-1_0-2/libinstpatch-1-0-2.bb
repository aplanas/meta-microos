SUMMARY = "MIDI instrument patch library"
DESCRIPTION = "libInstPatch stands for lib-Instrument-Patch and is a library for processing \
digital sample based MIDI instrument 'patch' files. The types of files \
libInstPatch supports are used for creating instrument sounds for wavetable \
synthesis. libInstPatch provides an object framework (based on GObject) to load \
patch files into, which can then be edited, converted, compressed and saved. \
 \
This package contains the library of libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "libinstpatch-1_0-2-1.1.6-2.9.aarch64.rpm"
RPM_HASH = "cf145f2dc80124a5619da9251e704743d5a66bcb5efa5a57ce78c9c68ce8ac880ee56cf4a4c3130b6608b677571f02f78b7e863afa2470a2b178382fa1557250"

RPROVIDES:${PN} += "libinstpatch-1-0-2 \
libinstpatch-1.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
