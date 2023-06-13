SUMMARY = "Industrial Metatheme for GNOME"
DESCRIPTION = "Metatheme for GNOME: Industrial strength WM theme for Metacity and \
Industrial icon theme for GNOME."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "gtk2-metatheme-industrial-0.6.5-72.13.noarch.rpm"
RPM_HASH = "52f72a464fca0931893689b20b4d4e620c465daa3504181bc75409a81b3c5e65b2dacf2dbf3c9aac0815084d673d10838a36362c957f2553169f6f8dc39ed09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes:/usr/share/themes/Industrial/index.theme \
gtk2-metatheme-industrial"

RDEPENDS:${PN} += "gtk2-engine-industrial \
gtk2-metatheme-gilouche \
gtk2-theme-industrial"

inherit rpm
