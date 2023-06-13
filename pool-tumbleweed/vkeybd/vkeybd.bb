SUMMARY = "Virtual Keyboard Instrument"
DESCRIPTION = "Vkeybd is a virtual keyboard (as in musical instrument) for AWE32/64, \
raw MIDI, and ALSA sequencer drivers.  It is written in Tcl/Tk.  Enjoy \
playing music with your 'computer' keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.18d"

RPM_NAME = "vkeybd-0.1.18d-24.8.aarch64.rpm"
RPM_HASH = "fc93c26c4c56daee5d3b4715d090d6d897cd0771e716f7b919f21fadb45f84fa34ae8fda358834f955560fda118f9eeac08d244d640269c7f65d967dbd6eb41e"

RPROVIDES:${PN} += "application() \
application(vkeybd.desktop) \
vkeybd \
vkeybd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit)"

inherit rpm
