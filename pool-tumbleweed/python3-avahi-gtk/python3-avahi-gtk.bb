SUMMARY = "A set of Avahi utilities written in Python Using python-gtk"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python3-avahi-gtk-0.8-23.1.aarch64.rpm"
RPM_HASH = "5ebdef4aba76f91d9989555438fcf1d92130b428bbf76afdb15189ed459f2f6ce875f290fed698da1a7010875eb18e433a186988b033fef3664f83d26b00e6c2"

RPROVIDES:${PN} += "application() \
application(avahi-discover.desktop) \
python-avahi-gtk \
python-avahi:/usr/bin/avahi-discover \
python3-avahi-gtk \
python3-avahi-gtk(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
python3-avahi \
python3-gobject \
typelib(GObject) \
typelib(Gtk)"

inherit rpm
