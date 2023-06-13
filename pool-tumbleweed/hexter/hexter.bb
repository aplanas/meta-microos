SUMMARY = "A Yamaha DX7 software synthesizer for DSSI"
DESCRIPTION = "Hexter is a software synthesizer that models the sound generation of \
a Yamaha DX7 synthesizer.  It can easily load most DX7 patch bank \
files, edit those patches via a built-in editor or MIDI sys-ex \
messages (ALSA systems only), and recreate the sound of the DX7 with \
greater accuracy than any previous open-source emulation (that the \
author is aware of....) \
 \
Hexter operates as a plugin for the DSSI Soft Synth Interface. DSSI \
is a plugin API for software instruments (soft synths) with user \
interfaces, permitting them to be hosted in-process by audio \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "hexter-1.1.1-1.11.aarch64.rpm"
RPM_HASH = "92b7fff1deb5275a43a8744f5ad532148d538ea34c0b057cdc0dfae372f98dfb7beb88eb44311476e92e9a8d9a75f75aa126e848014adc24b2a70421189de543"

RPROVIDES:${PN} += "hexter \
hexter(aarch-64)"

RDEPENDS:${PN} += "dssi \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
