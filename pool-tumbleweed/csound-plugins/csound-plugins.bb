SUMMARY = "Plugins for csound"
DESCRIPTION = "Plugins for csound"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-plugins-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "ef221b645520392f48aff690f16fe7d6cfd66cc7c66b7a0db4819598e50685874c62f51583b968f1c8dad5c6c847537eb2d64a4fa4738a1af8e3ff3770db6e70"

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
