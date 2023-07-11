SUMMARY = "Translations for package gnome-dvb-daemon"
DESCRIPTION = "Provides translations for the 'gnome-dvb-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "gnome-dvb-daemon-lang-0.2.90-4.11.noarch.rpm"
RPM_HASH = "787029a02472718dd0f0ac2dfffe90054e504bcad5bf075b2fd7a52f97036983c14e2c08141c799fdc2f353edfae3bbc964f65b357326f3e4b8af05d5816e146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-dvb-daemon-lang \
gnome-dvb-daemon-lang-all \
locale-gnome-dvb-daemon-ar \
locale-gnome-dvb-daemon-ca \
locale-gnome-dvb-daemon-ca@valencia \
locale-gnome-dvb-daemon-cs \
locale-gnome-dvb-daemon-da \
locale-gnome-dvb-daemon-de \
locale-gnome-dvb-daemon-el \
locale-gnome-dvb-daemon-en-GB \
locale-gnome-dvb-daemon-es \
locale-gnome-dvb-daemon-fi \
locale-gnome-dvb-daemon-fr \
locale-gnome-dvb-daemon-gl \
locale-gnome-dvb-daemon-hu \
locale-gnome-dvb-daemon-id \
locale-gnome-dvb-daemon-it \
locale-gnome-dvb-daemon-lt \
locale-gnome-dvb-daemon-lv \
locale-gnome-dvb-daemon-nb \
locale-gnome-dvb-daemon-pl \
locale-gnome-dvb-daemon-pt-BR \
locale-gnome-dvb-daemon-ru \
locale-gnome-dvb-daemon-sk \
locale-gnome-dvb-daemon-sl \
locale-gnome-dvb-daemon-sr \
locale-gnome-dvb-daemon-sr@latin \
locale-gnome-dvb-daemon-sv \
locale-gnome-dvb-daemon-te \
locale-gnome-dvb-daemon-tr \
locale-gnome-dvb-daemon-zh-CN"

RDEPENDS:${PN} += "gnome-dvb-daemon"

inherit rpm
