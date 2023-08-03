SUMMARY = "Translations for package gstreamer"
DESCRIPTION = "Provides translations for the 'gstreamer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-lang-1.22.5-1.1.noarch.rpm"
RPM_HASH = "516ff92c15a91fc1f1818c248bf3863ba5cf4aac4c1fdd9a4e9944b740963c4379cb91fa646dad1e508e1fe9bcdc5ec4d49e28a72f5fd0298e2366544872041f"
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
