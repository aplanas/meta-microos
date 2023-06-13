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
 * VST plug-in \
 \
This package includes the DSSI implementation of the synthesizer."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-plugin-dssi-1.13.2-1.4.aarch64.rpm"
RPM_HASH = "344bf75662dfaf27e263de08e7131744042a4258662086cfa8645e83fa064c9051b968bf1b424b6403367d452a4fb49d490d689326cef6f15abd811eba2a8e2f"

RPROVIDES:${PN} += "amsynth-plugin-dssi \
amsynth-plugin-dssi(aarch-64) \
metainfo() \
metainfo(dssi-amsynth-plugin.metainfo.xml)"

RDEPENDS:${PN} += "amsynth \
dssi \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
