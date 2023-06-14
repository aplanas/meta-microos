SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Provides translations to the package kactivitymanagerd."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kactivitymanagerd-lang-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "70adb75e04c2ad1712e59f37e7efcdd768aba84bd705de35675e90691586ca8f724e7742b6e679d110d918c3dcfdacb40b538c2553589c3480eaf91b0c0471c2"

RPROVIDES:${PN} += "kactivitymanagerd-lang \
libKF5Activities5-lang \
locale-kactivitymanagerd-ar \
locale-kactivitymanagerd-az \
locale-kactivitymanagerd-bg \
locale-kactivitymanagerd-bs \
locale-kactivitymanagerd-ca \
locale-kactivitymanagerd-ca@valencia \
locale-kactivitymanagerd-cs \
locale-kactivitymanagerd-da \
locale-kactivitymanagerd-de \
locale-kactivitymanagerd-el \
locale-kactivitymanagerd-en-GB \
locale-kactivitymanagerd-es \
locale-kactivitymanagerd-et \
locale-kactivitymanagerd-eu \
locale-kactivitymanagerd-fi \
locale-kactivitymanagerd-fr \
locale-kactivitymanagerd-ga \
locale-kactivitymanagerd-gd \
locale-kactivitymanagerd-gl \
locale-kactivitymanagerd-gu \
locale-kactivitymanagerd-he \
locale-kactivitymanagerd-hi \
locale-kactivitymanagerd-hr \
locale-kactivitymanagerd-hu \
locale-kactivitymanagerd-ia \
locale-kactivitymanagerd-id \
locale-kactivitymanagerd-is \
locale-kactivitymanagerd-it \
locale-kactivitymanagerd-ja \
locale-kactivitymanagerd-ka \
locale-kactivitymanagerd-kk \
locale-kactivitymanagerd-km \
locale-kactivitymanagerd-kn \
locale-kactivitymanagerd-ko \
locale-kactivitymanagerd-lt \
locale-kactivitymanagerd-lv \
locale-kactivitymanagerd-ml \
locale-kactivitymanagerd-mr \
locale-kactivitymanagerd-ms \
locale-kactivitymanagerd-nb \
locale-kactivitymanagerd-nds \
locale-kactivitymanagerd-nl \
locale-kactivitymanagerd-nn \
locale-kactivitymanagerd-pa \
locale-kactivitymanagerd-pl \
locale-kactivitymanagerd-pt \
locale-kactivitymanagerd-pt-BR \
locale-kactivitymanagerd-ro \
locale-kactivitymanagerd-ru \
locale-kactivitymanagerd-sk \
locale-kactivitymanagerd-sl \
locale-kactivitymanagerd-sr \
locale-kactivitymanagerd-sr@ijekavian \
locale-kactivitymanagerd-sr@ijekavianlatin \
locale-kactivitymanagerd-sr@latin \
locale-kactivitymanagerd-sv \
locale-kactivitymanagerd-th \
locale-kactivitymanagerd-tr \
locale-kactivitymanagerd-ug \
locale-kactivitymanagerd-uk \
locale-kactivitymanagerd-vi \
locale-kactivitymanagerd-wa \
locale-kactivitymanagerd-zh-CN \
locale-kactivitymanagerd-zh-TW"

RDEPENDS:${PN} += "kactivitymanagerd"

inherit rpm
