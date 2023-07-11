SUMMARY = "GUI tool to set individual hardware stream volumes"
DESCRIPTION = "This tool allows you to control the volume of individual streams on \
sound cards that use hardware mixing, i.e., those based on the \
following chips: Creative Emu10k1, VIA VT823x southbridge, Yamaha DS-1"
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "hwmixvolume-0.9-24.4.aarch64.rpm"
RPM_HASH = "9caf580c7040390aeca43b0d68a66c3d8c729c3f0c424db30e0c83b5ecb9830c78627fbf45e9ec6c2fc9cd30dea8f2949a9adf5d27d2920921e4206a43d3dbb5"

RPROVIDES:${PN} += "alsa-tools-gui \
hwmixvolume"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/sh \
pyalsa \
typelib-GLib \
typelib-Gtk"

inherit rpm
