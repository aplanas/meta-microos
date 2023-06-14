SUMMARY = "Translations for package mousepad"
DESCRIPTION = "Provides translations for the 'mousepad' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "mousepad-lang-0.6.1-1.1.noarch.rpm"
RPM_HASH = "975c0884ed1cc80de4045302102de3f70d5dec2ccd3d5144325189511821d3b692161e1374edc5be01f5f50da8c9763d229a1d3877b130882084fbb4a862ef4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mousepad-ar \
locale-mousepad-ast \
locale-mousepad-be \
locale-mousepad-bg \
locale-mousepad-ca \
locale-mousepad-cs \
locale-mousepad-da \
locale-mousepad-de \
locale-mousepad-el \
locale-mousepad-en-AU \
locale-mousepad-en-GB \
locale-mousepad-es \
locale-mousepad-et \
locale-mousepad-eu \
locale-mousepad-fi \
locale-mousepad-fr \
locale-mousepad-gl \
locale-mousepad-he \
locale-mousepad-hr \
locale-mousepad-hu \
locale-mousepad-id \
locale-mousepad-is \
locale-mousepad-it \
locale-mousepad-ja \
locale-mousepad-kk \
locale-mousepad-ko \
locale-mousepad-lt \
locale-mousepad-ms \
locale-mousepad-nb \
locale-mousepad-nl \
locale-mousepad-nn \
locale-mousepad-oc \
locale-mousepad-pl \
locale-mousepad-pt \
locale-mousepad-pt-BR \
locale-mousepad-ro \
locale-mousepad-ru \
locale-mousepad-sk \
locale-mousepad-sl \
locale-mousepad-sq \
locale-mousepad-sr \
locale-mousepad-sv \
locale-mousepad-te \
locale-mousepad-th \
locale-mousepad-tr \
locale-mousepad-ug \
locale-mousepad-uk \
locale-mousepad-zh-CN \
locale-mousepad-zh-TW \
mousepad-lang \
mousepad-lang-all"

RDEPENDS:${PN} += "mousepad"

inherit rpm
