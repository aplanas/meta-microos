SUMMARY = "Translations for package gnome-pomodoro"
DESCRIPTION = "Provides translations for the 'gnome-pomodoro' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.23.1"

RPM_NAME = "gnome-pomodoro-lang-0.23.1-1.1.noarch.rpm"
RPM_HASH = "cd460c21b64b51e79d18456895de689d96ab708f1879224f376d30af26894e746f80ce97ae1cc38ca1252dd44d58d497ccff8d6fe90aef5925f648a786c316c2"
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
