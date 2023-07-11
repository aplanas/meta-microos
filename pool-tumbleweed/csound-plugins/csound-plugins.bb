SUMMARY = "Plugins for csound"
DESCRIPTION = "Plugins for csound"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-plugins-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "78e86f1e4b535cc1218a381e43c9f675aa24d82510b3434aedb78ce98b72d8482cb8a47c29020b08b039910f6fddb603bd1cbf304142862bad1a7d837849c65e"

RPROVIDES:${PN} += "csound-plugins \
libampmidid.so \
libarrayops.so \
libbformdec2.so \
libcontrol.so \
libdeprecated.so \
libdoppler.so \
libdssi4cs.so \
libfractalnoise.so \
libftsamplebank.so \
libipmidi.so \
libjoystick.so \
liblfsr.so \
libmixer.so \
libosc.so \
libpadsynth.so \
libpvsops.so \
librtalsa.so \
librtjack.so \
librtpa.so \
librtpulse.so \
libsignalflowgraph.so \
libstdutil.so \
libtrigenvsegs.so \
liburandom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
