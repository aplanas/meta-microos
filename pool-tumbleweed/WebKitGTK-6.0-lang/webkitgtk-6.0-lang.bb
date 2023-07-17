SUMMARY = "Translations for package WebKitGTK-6.0"
DESCRIPTION = "Provides translations for the 'WebKitGTK-6.0' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "WebKitGTK-6.0-lang-2.40.3-2.1.noarch.rpm"
RPM_HASH = "25bc55036776faac6b765f6e621fdee51e55b4162d96b54845eac30f75abce55e4b849393b8be33323614db4e0e8e6dde2e682373da2ab5c72d320a717b1ec8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WebKitGTK-6.0-lang \
WebKitGTK-6.0-lang-all \
locale-WebKitGTK-6.0-ar \
locale-WebKitGTK-6.0-as \
locale-WebKitGTK-6.0-bg \
locale-WebKitGTK-6.0-ca \
locale-WebKitGTK-6.0-cs \
locale-WebKitGTK-6.0-da \
locale-WebKitGTK-6.0-de \
locale-WebKitGTK-6.0-el \
locale-WebKitGTK-6.0-en-CA \
locale-WebKitGTK-6.0-en-GB \
locale-WebKitGTK-6.0-eo \
locale-WebKitGTK-6.0-es \
locale-WebKitGTK-6.0-et \
locale-WebKitGTK-6.0-eu \
locale-WebKitGTK-6.0-fi \
locale-WebKitGTK-6.0-fr \
locale-WebKitGTK-6.0-gl \
locale-WebKitGTK-6.0-gu \
locale-WebKitGTK-6.0-he \
locale-WebKitGTK-6.0-hi \
locale-WebKitGTK-6.0-hr \
locale-WebKitGTK-6.0-hu \
locale-WebKitGTK-6.0-id \
locale-WebKitGTK-6.0-it \
locale-WebKitGTK-6.0-ja \
locale-WebKitGTK-6.0-ka \
locale-WebKitGTK-6.0-kn \
locale-WebKitGTK-6.0-ko \
locale-WebKitGTK-6.0-lt \
locale-WebKitGTK-6.0-lv \
locale-WebKitGTK-6.0-ml \
locale-WebKitGTK-6.0-mr \
locale-WebKitGTK-6.0-nb \
locale-WebKitGTK-6.0-nl \
locale-WebKitGTK-6.0-or \
locale-WebKitGTK-6.0-pa \
locale-WebKitGTK-6.0-pl \
locale-WebKitGTK-6.0-pt \
locale-WebKitGTK-6.0-pt-BR \
locale-WebKitGTK-6.0-ro \
locale-WebKitGTK-6.0-ru \
locale-WebKitGTK-6.0-sl \
locale-WebKitGTK-6.0-sr \
locale-WebKitGTK-6.0-sr@latin \
locale-WebKitGTK-6.0-sv \
locale-WebKitGTK-6.0-ta \
locale-WebKitGTK-6.0-te \
locale-WebKitGTK-6.0-tr \
locale-WebKitGTK-6.0-uk \
locale-WebKitGTK-6.0-vi \
locale-WebKitGTK-6.0-zh-CN"

RDEPENDS:${PN} += "WebKitGTK-6.0"

inherit rpm
