SUMMARY = "Translations for package libKF5DBusAddons5"
DESCRIPTION = "Provides translations for the 'libKF5DBusAddons5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5DBusAddons5-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "0003fe047a160c2d70fc4c63136783e249f9eaed49abed96f801af1d88a293a01b21b7f15c71daf34e1709c379ce7f97d2cc175c43537af281d83131d995d13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5DBusAddons5-lang \
libKF5DBusAddons5-lang-all \
locale-libKF5DBusAddons5-ar \
locale-libKF5DBusAddons5-az \
locale-libKF5DBusAddons5-bg \
locale-libKF5DBusAddons5-bs \
locale-libKF5DBusAddons5-ca \
locale-libKF5DBusAddons5-ca@valencia \
locale-libKF5DBusAddons5-cs \
locale-libKF5DBusAddons5-da \
locale-libKF5DBusAddons5-de \
locale-libKF5DBusAddons5-el \
locale-libKF5DBusAddons5-en-GB \
locale-libKF5DBusAddons5-es \
locale-libKF5DBusAddons5-et \
locale-libKF5DBusAddons5-eu \
locale-libKF5DBusAddons5-fi \
locale-libKF5DBusAddons5-fr \
locale-libKF5DBusAddons5-gd \
locale-libKF5DBusAddons5-gl \
locale-libKF5DBusAddons5-hi \
locale-libKF5DBusAddons5-hu \
locale-libKF5DBusAddons5-ia \
locale-libKF5DBusAddons5-id \
locale-libKF5DBusAddons5-is \
locale-libKF5DBusAddons5-it \
locale-libKF5DBusAddons5-ja \
locale-libKF5DBusAddons5-ka \
locale-libKF5DBusAddons5-ko \
locale-libKF5DBusAddons5-lt \
locale-libKF5DBusAddons5-ml \
locale-libKF5DBusAddons5-nb \
locale-libKF5DBusAddons5-nds \
locale-libKF5DBusAddons5-nl \
locale-libKF5DBusAddons5-nn \
locale-libKF5DBusAddons5-pa \
locale-libKF5DBusAddons5-pl \
locale-libKF5DBusAddons5-pt \
locale-libKF5DBusAddons5-pt-BR \
locale-libKF5DBusAddons5-ro \
locale-libKF5DBusAddons5-ru \
locale-libKF5DBusAddons5-sk \
locale-libKF5DBusAddons5-sl \
locale-libKF5DBusAddons5-sr \
locale-libKF5DBusAddons5-sr@ijekavian \
locale-libKF5DBusAddons5-sr@ijekavianlatin \
locale-libKF5DBusAddons5-sr@latin \
locale-libKF5DBusAddons5-sv \
locale-libKF5DBusAddons5-tr \
locale-libKF5DBusAddons5-uk \
locale-libKF5DBusAddons5-zh-CN \
locale-libKF5DBusAddons5-zh-TW"

RDEPENDS:${PN} += "libKF5DBusAddons5"

inherit rpm
