SUMMARY = "Plugins for csound"
DESCRIPTION = "Plugins for csound"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-plugins-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "ef221b645520392f48aff690f16fe7d6cfd66cc7c66b7a0db4819598e50685874c62f51583b968f1c8dad5c6c847537eb2d64a4fa4738a1af8e3ff3770db6e70"

RPROVIDES:${PN} += "csound-plugins \
csound-plugins(aarch-64) \
libampmidid.so()(64bit) \
libarrayops.so()(64bit) \
libbformdec2.so()(64bit) \
libcontrol.so()(64bit) \
libdeprecated.so()(64bit) \
libdoppler.so()(64bit) \
libdssi4cs.so()(64bit) \
libfractalnoise.so()(64bit) \
libftsamplebank.so()(64bit) \
libipmidi.so()(64bit) \
libjoystick.so()(64bit) \
liblfsr.so()(64bit) \
libmixer.so()(64bit) \
libosc.so()(64bit) \
libpadsynth.so()(64bit) \
libpvsops.so()(64bit) \
librtalsa.so()(64bit) \
librtjack.so()(64bit) \
librtpa.so()(64bit) \
librtpulse.so()(64bit) \
libsignalflowgraph.so()(64bit) \
libstdutil.so()(64bit) \
libtrigenvsegs.so()(64bit) \
liburandom.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libportaudio.so.2()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
