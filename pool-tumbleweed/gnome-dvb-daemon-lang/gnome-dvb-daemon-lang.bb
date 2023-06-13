SUMMARY = "Translations for package gnome-dvb-daemon"
DESCRIPTION = "Provides translations for the 'gnome-dvb-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "gnome-dvb-daemon-lang-0.2.90-4.10.noarch.rpm"
RPM_HASH = "b8a556f637c596011bb50f6aa86eae9cda4c382fadd63ee31cbffa17ecf3134880d0fdbc74370e6488cd90cfb05fa0b969440beb330f8f85ade426b2c88690c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-dvb-daemon-lang \
gnome-dvb-daemon-lang-all \
locale(gnome-dvb-daemon:ar) \
locale(gnome-dvb-daemon:ca) \
locale(gnome-dvb-daemon:ca@valencia) \
locale(gnome-dvb-daemon:cs) \
locale(gnome-dvb-daemon:da) \
locale(gnome-dvb-daemon:de) \
locale(gnome-dvb-daemon:el) \
locale(gnome-dvb-daemon:en_GB) \
locale(gnome-dvb-daemon:es) \
locale(gnome-dvb-daemon:fi) \
locale(gnome-dvb-daemon:fr) \
locale(gnome-dvb-daemon:gl) \
locale(gnome-dvb-daemon:hu) \
locale(gnome-dvb-daemon:id) \
locale(gnome-dvb-daemon:it) \
locale(gnome-dvb-daemon:lt) \
locale(gnome-dvb-daemon:lv) \
locale(gnome-dvb-daemon:nb) \
locale(gnome-dvb-daemon:pl) \
locale(gnome-dvb-daemon:pt_BR) \
locale(gnome-dvb-daemon:ru) \
locale(gnome-dvb-daemon:sk) \
locale(gnome-dvb-daemon:sl) \
locale(gnome-dvb-daemon:sr) \
locale(gnome-dvb-daemon:sr@latin) \
locale(gnome-dvb-daemon:sv) \
locale(gnome-dvb-daemon:te) \
locale(gnome-dvb-daemon:tr) \
locale(gnome-dvb-daemon:zh_CN)"

RDEPENDS:${PN} += "gnome-dvb-daemon"

inherit rpm
