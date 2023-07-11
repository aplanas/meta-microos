SUMMARY = "Translations for package libpwquality"
DESCRIPTION = "Provides translations for the 'libpwquality' package."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-lang-1.4.5-1.3.noarch.rpm"
RPM_HASH = "9b4600d0d8d12a143d1c37f03634b1bf399480f0382bcfe06fd00848c6c5462d0d8a9de4b4aefb50f62004d3e509041cc53df17e9d95df44e12a0f2f0d3ae68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpwquality-lang \
libpwquality-lang-all \
locale-libpwquality-ar \
locale-libpwquality-as \
locale-libpwquality-az \
locale-libpwquality-bg \
locale-libpwquality-bn-IN \
locale-libpwquality-ca \
locale-libpwquality-cs \
locale-libpwquality-da \
locale-libpwquality-de \
locale-libpwquality-es \
locale-libpwquality-eu \
locale-libpwquality-fa \
locale-libpwquality-fi \
locale-libpwquality-fr \
locale-libpwquality-fur \
locale-libpwquality-gu \
locale-libpwquality-he \
locale-libpwquality-hi \
locale-libpwquality-hu \
locale-libpwquality-id \
locale-libpwquality-it \
locale-libpwquality-ja \
locale-libpwquality-ka \
locale-libpwquality-kk \
locale-libpwquality-km \
locale-libpwquality-kn \
locale-libpwquality-ko \
locale-libpwquality-ml \
locale-libpwquality-mr \
locale-libpwquality-nb \
locale-libpwquality-nl \
locale-libpwquality-or \
locale-libpwquality-pa \
locale-libpwquality-pl \
locale-libpwquality-pt \
locale-libpwquality-pt-BR \
locale-libpwquality-ru \
locale-libpwquality-si \
locale-libpwquality-sk \
locale-libpwquality-sq \
locale-libpwquality-sr \
locale-libpwquality-sr@latin \
locale-libpwquality-sv \
locale-libpwquality-ta \
locale-libpwquality-te \
locale-libpwquality-tr \
locale-libpwquality-uk \
locale-libpwquality-vi \
locale-libpwquality-zh-CN \
locale-libpwquality-zh-TW"

RDEPENDS:${PN} += "libpwquality"

inherit rpm
