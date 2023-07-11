SUMMARY = "Translations for package qalculate-gtk"
DESCRIPTION = "Provides translations for the 'qalculate-gtk' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-gtk-lang-4.6.1-1.2.noarch.rpm"
RPM_HASH = "4db4e181b392b23aaf6ea99e2231719fcb2e517f1d81714e510eb7e2c587debf3eb61a8a43773a67f24c43a8acf53ff1b56fbb95f46b92649cd26c410ed347ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qalculate-gtk-ca \
locale-qalculate-gtk-de \
locale-qalculate-gtk-es \
locale-qalculate-gtk-fr \
locale-qalculate-gtk-nl \
locale-qalculate-gtk-pt-BR \
locale-qalculate-gtk-ru \
locale-qalculate-gtk-sl \
locale-qalculate-gtk-sv \
locale-qalculate-gtk-zh-CN \
qalculate-gtk-lang \
qalculate-gtk-lang-all"

RDEPENDS:${PN} += "qalculate-gtk"

inherit rpm
