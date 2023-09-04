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

RPM_NAME = "amsynth-plugin-dssi-1.13.2-1.7.aarch64.rpm"
RPM_HASH = "13fcc45216fa4304c53b3eb960550f2d5b1fab40e28157703fda1c819d404aed2c4edac9028fbf3c4957ee4bb62f2ba666c3f830656aead31d9833fa17ad83c7"

RPROVIDES:${PN} += "amsynth-plugin-dssi"

RDEPENDS:${PN} += "amsynth \
dssi \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libharfbuzz.so.0 \
liblo.so.7 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libstdc++.so.6"

inherit rpm
