SUMMARY = "Translations for package phonon4qt5-backend-vlc"
DESCRIPTION = "Provides translations for the 'phonon4qt5-backend-vlc' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.3"

RPM_NAME = "phonon4qt5-backend-vlc-lang-0.11.3-1.15.noarch.rpm"
RPM_HASH = "acfd84116b87f0bd3c4b4650afbdab5a94d321dafc3b36ae27c7480ab521d992e9774592608ce9351a5aa1072a553331ffe3a46c945ab7663fae6f41f87192d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phonon4qt5-backend-vlc-ca \
locale-phonon4qt5-backend-vlc-ca@valencia \
locale-phonon4qt5-backend-vlc-cs \
locale-phonon4qt5-backend-vlc-da \
locale-phonon4qt5-backend-vlc-de \
locale-phonon4qt5-backend-vlc-en-GB \
locale-phonon4qt5-backend-vlc-es \
locale-phonon4qt5-backend-vlc-et \
locale-phonon4qt5-backend-vlc-eu \
locale-phonon4qt5-backend-vlc-fi \
locale-phonon4qt5-backend-vlc-fr \
locale-phonon4qt5-backend-vlc-gl \
locale-phonon4qt5-backend-vlc-hu \
locale-phonon4qt5-backend-vlc-id \
locale-phonon4qt5-backend-vlc-it \
locale-phonon4qt5-backend-vlc-ko \
locale-phonon4qt5-backend-vlc-nl \
locale-phonon4qt5-backend-vlc-nn \
locale-phonon4qt5-backend-vlc-pl \
locale-phonon4qt5-backend-vlc-pt \
locale-phonon4qt5-backend-vlc-pt-BR \
locale-phonon4qt5-backend-vlc-ro \
locale-phonon4qt5-backend-vlc-ru \
locale-phonon4qt5-backend-vlc-sk \
locale-phonon4qt5-backend-vlc-sl \
locale-phonon4qt5-backend-vlc-sv \
locale-phonon4qt5-backend-vlc-uk \
locale-phonon4qt5-backend-vlc-zh-CN \
locale-phonon4qt5-backend-vlc-zh-TW \
phonon4qt5-backend-vlc-lang \
phonon4qt5-backend-vlc-lang-all"

RDEPENDS:${PN} += "phonon4qt5-backend-vlc"

inherit rpm
