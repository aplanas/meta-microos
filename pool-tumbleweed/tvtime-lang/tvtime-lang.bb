SUMMARY = "Translations for package tvtime"
DESCRIPTION = "Provides translations for the 'tvtime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-lang-1.0.11-2.18.noarch.rpm"
RPM_HASH = "066293991cf3618228625ba165b439cad4f8d17465fb1d11fb72c6ab3e048fbd834c81f5763639cc9e9f21f657ecf47639d2521f266daf827d2729f3905bc4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tvtime-ca \
locale-tvtime-cs \
locale-tvtime-de \
locale-tvtime-es \
locale-tvtime-fi \
locale-tvtime-fr \
locale-tvtime-hu \
locale-tvtime-ko \
locale-tvtime-lv \
locale-tvtime-nl \
locale-tvtime-nn \
locale-tvtime-pl \
locale-tvtime-pt \
locale-tvtime-pt-BR \
locale-tvtime-ru \
locale-tvtime-sk \
locale-tvtime-sv \
locale-tvtime-uk \
tvtime-lang \
tvtime-lang-all"

RDEPENDS:${PN} += "tvtime"

inherit rpm
