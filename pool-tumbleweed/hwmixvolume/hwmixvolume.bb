SUMMARY = "GUI tool to set individual hardware stream volumes"
DESCRIPTION = "This tool allows you to control the volume of individual streams on \
sound cards that use hardware mixing, i.e., those based on the \
following chips: Creative Emu10k1, VIA VT823x southbridge, Yamaha DS-1"
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "hwmixvolume-0.9-24.3.aarch64.rpm"
RPM_HASH = "50858931d9fbd74abee59664545eb22ba1afde7b20341bf22f62a43389eb55bfd857d5feb01922b52b5c0ed73ccc85ae3ed537f0b1aafaf81b9d3c955bb4b38e"

RPROVIDES:${PN} += "alsa-tools-gui \
hwmixvolume"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/sh \
pyalsa \
typelib-GLib \
typelib-Gtk"

inherit rpm
