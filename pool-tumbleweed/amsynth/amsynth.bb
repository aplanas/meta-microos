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

RPM_NAME = "amsynth-1.13.2-1.6.aarch64.rpm"
RPM_HASH = "a0d979899acc5113ff90be01970755ab3240315f351a7e6ebc0c51e6db74d63eb0087b8ff0ed5acc10e87053d8d37cb1ccf4381da937b681fb4352972d441ad4"

RPROVIDES:${PN} += "amsynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libasound.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
