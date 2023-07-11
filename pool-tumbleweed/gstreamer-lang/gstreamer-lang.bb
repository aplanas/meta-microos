SUMMARY = "Translations for package gstreamer"
DESCRIPTION = "Provides translations for the 'gstreamer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-lang-1.22.4-1.1.noarch.rpm"
RPM_HASH = "79ce83895baf0e646e9b13f28ea77642a11f5a60b1ebbd7f9c6563cbd8a0f762d4c6cb1ed702210f2963585dedf5aebb7971d4cf8b6d6d42a41a0b7eaa038eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-lang \
gstreamer-lang-all \
locale-gstreamer-af \
locale-gstreamer-ast \
locale-gstreamer-az \
locale-gstreamer-be \
locale-gstreamer-bg \
locale-gstreamer-ca \
locale-gstreamer-cs \
locale-gstreamer-da \
locale-gstreamer-de \
locale-gstreamer-el \
locale-gstreamer-en-GB \
locale-gstreamer-eo \
locale-gstreamer-es \
locale-gstreamer-eu \
locale-gstreamer-fi \
locale-gstreamer-fr \
locale-gstreamer-fur \
locale-gstreamer-gl \
locale-gstreamer-hr \
locale-gstreamer-hu \
locale-gstreamer-id \
locale-gstreamer-it \
locale-gstreamer-ja \
locale-gstreamer-ka \
locale-gstreamer-ko \
locale-gstreamer-lt \
locale-gstreamer-nb \
locale-gstreamer-nl \
locale-gstreamer-pl \
locale-gstreamer-pt-BR \
locale-gstreamer-ro \
locale-gstreamer-ru \
locale-gstreamer-sk \
locale-gstreamer-sl \
locale-gstreamer-sq \
locale-gstreamer-sr \
locale-gstreamer-sv \
locale-gstreamer-tr \
locale-gstreamer-uk \
locale-gstreamer-vi \
locale-gstreamer-zh-CN \
locale-gstreamer-zh-TW"

RDEPENDS:${PN} += "gstreamer"

inherit rpm
