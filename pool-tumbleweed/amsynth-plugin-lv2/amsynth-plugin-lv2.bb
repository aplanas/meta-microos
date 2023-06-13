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
This package includes the LV2 implementation of the synthesizer."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.2"

RPM_NAME = "amsynth-plugin-lv2-1.13.2-1.4.aarch64.rpm"
RPM_HASH = "4a5e203a1e81a649ec8a3e62dc8ea033fb02c84b2277234a2cc969ff2ae61b0ba82a4a0b75e3852dfaac0563ce3ad37c7f752428bb351849c31d46ae36d8b16d"

RPROVIDES:${PN} += "amsynth-plugin-lv2 \
amsynth-plugin-lv2(aarch-64) \
metainfo() \
metainfo(lv2-amsynth-plugin.metainfo.xml)"

RDEPENDS:${PN} += "amsynth \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
