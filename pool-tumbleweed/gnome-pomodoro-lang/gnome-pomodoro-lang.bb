SUMMARY = "Translations for package gnome-pomodoro"
DESCRIPTION = "Provides translations for the 'gnome-pomodoro' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.23.1"

RPM_NAME = "gnome-pomodoro-lang-0.23.1-1.2.noarch.rpm"
RPM_HASH = "db8a0d781e472f4d0db6511231cbaa46923d88174e53093986f5d57d3b0a39639cd1979d91156a5b7880919dc5d40e6dbec4bfd135ea00f4f0f0c6ea73198c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-pomodoro-lang \
gnome-pomodoro-lang-all \
locale-gnome-pomodoro-ca \
locale-gnome-pomodoro-cs \
locale-gnome-pomodoro-de \
locale-gnome-pomodoro-el \
locale-gnome-pomodoro-es \
locale-gnome-pomodoro-fi \
locale-gnome-pomodoro-fr \
locale-gnome-pomodoro-hr \
locale-gnome-pomodoro-id \
locale-gnome-pomodoro-it \
locale-gnome-pomodoro-kk \
locale-gnome-pomodoro-ko \
locale-gnome-pomodoro-lt \
locale-gnome-pomodoro-nb \
locale-gnome-pomodoro-nl \
locale-gnome-pomodoro-pl \
locale-gnome-pomodoro-pt-BR \
locale-gnome-pomodoro-ru \
locale-gnome-pomodoro-sv \
locale-gnome-pomodoro-zh-CN"

RDEPENDS:${PN} += "gnome-pomodoro"

inherit rpm
