SUMMARY = "Translations for package WebKitGTK-4.1"
DESCRIPTION = "Provides translations for the 'WebKitGTK-4.1' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "WebKitGTK-4.1-lang-2.40.5-1.1.noarch.rpm"
RPM_HASH = "1222892acc20a6c6dd7de7b1aa04eb27845499b8bb3bf4d6987009820d776ca65cd2dd38bdb7c953d770c8355d5f3b556f5f97084d2df2512637b8181763c76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WebKitGTK-4.1-lang \
WebKitGTK-4.1-lang-all \
locale-WebKitGTK-4.1-ar \
locale-WebKitGTK-4.1-as \
locale-WebKitGTK-4.1-bg \
locale-WebKitGTK-4.1-ca \
locale-WebKitGTK-4.1-cs \
locale-WebKitGTK-4.1-da \
locale-WebKitGTK-4.1-de \
locale-WebKitGTK-4.1-el \
locale-WebKitGTK-4.1-en-CA \
locale-WebKitGTK-4.1-en-GB \
locale-WebKitGTK-4.1-eo \
locale-WebKitGTK-4.1-es \
locale-WebKitGTK-4.1-et \
locale-WebKitGTK-4.1-eu \
locale-WebKitGTK-4.1-fi \
locale-WebKitGTK-4.1-fr \
locale-WebKitGTK-4.1-gl \
locale-WebKitGTK-4.1-gu \
locale-WebKitGTK-4.1-he \
locale-WebKitGTK-4.1-hi \
locale-WebKitGTK-4.1-hr \
locale-WebKitGTK-4.1-hu \
locale-WebKitGTK-4.1-id \
locale-WebKitGTK-4.1-it \
locale-WebKitGTK-4.1-ja \
locale-WebKitGTK-4.1-ka \
locale-WebKitGTK-4.1-kn \
locale-WebKitGTK-4.1-ko \
locale-WebKitGTK-4.1-lt \
locale-WebKitGTK-4.1-lv \
locale-WebKitGTK-4.1-ml \
locale-WebKitGTK-4.1-mr \
locale-WebKitGTK-4.1-nb \
locale-WebKitGTK-4.1-nl \
locale-WebKitGTK-4.1-or \
locale-WebKitGTK-4.1-pa \
locale-WebKitGTK-4.1-pl \
locale-WebKitGTK-4.1-pt \
locale-WebKitGTK-4.1-pt-BR \
locale-WebKitGTK-4.1-ro \
locale-WebKitGTK-4.1-ru \
locale-WebKitGTK-4.1-sl \
locale-WebKitGTK-4.1-sr \
locale-WebKitGTK-4.1-sr@latin \
locale-WebKitGTK-4.1-sv \
locale-WebKitGTK-4.1-ta \
locale-WebKitGTK-4.1-te \
locale-WebKitGTK-4.1-tr \
locale-WebKitGTK-4.1-uk \
locale-WebKitGTK-4.1-vi \
locale-WebKitGTK-4.1-zh-CN"

RDEPENDS:${PN} += "WebKitGTK-4.1"

inherit rpm
