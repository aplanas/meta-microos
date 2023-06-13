SUMMARY = "Analog modelling (a.k.a virtual analog) software synthesizer"
DESCRIPTION = "Amsynth is an analog modelling (a.k.a virtual analog) software synthesizer. \
It mimics the operation of early analog subtractive synthesizers with \
classic oscillator waveforms, envelopes, filter, modulation and effects. \
The aim is to make it easy to create and modify sounds. \
 \
Features: \
 * Dual oscillators (sine / saw / square / noise) with hard sync \
 * 12/24 dB/oct resonant filter (low-pass / high-pass / band-pass / notch) \
 * Mono / poly / legato keyboard modes \
 * Dual ADSR envelope generators (filter & amplitude) \
 * LFO which can modulate the oscillators, filter, and amplitude \
 * Distortion and reverb \
 * Hundreds of presets \
 \
There are currently several different ways to run amsynth: \
 * Stand-alone application using JACK, ALSA or OSS \
 * DSSI plug-in \
 * LV2 plug-in \
 * VST plug-in"
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-1.13.2-1.4.aarch64.rpm"
RPM_HASH = "88d26f62945861b3615e75ad5d25166692d79671d5c4b36ff0641b4ec5e71839b530ad6dc886bb4f3ab4d2135a2000d0dc33ae88b641f372be7462b1e0b2d159"

RPROVIDES:${PN} += "amsynth \
amsynth(aarch-64) \
application() \
application(amsynth.desktop) \
metainfo() \
metainfo(amsynth.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
