SUMMARY = "Translations for package gstreamer-plugins-bad"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-bad' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-lang-1.22.5-1.1.noarch.rpm"
RPM_HASH = "a6deca7c09dec020eda8b1b7691716f4c41e7f09ed08d4007a95a736e8d1a901209cfe231dadfc8b1e9270601de9452a0237dc148273c05843dd278df774679d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-bad-lang \
gstreamer-plugins-bad-lang-all \
locale-gstreamer-plugins-bad-af \
locale-gstreamer-plugins-bad-ast \
locale-gstreamer-plugins-bad-az \
locale-gstreamer-plugins-bad-bg \
locale-gstreamer-plugins-bad-ca \
locale-gstreamer-plugins-bad-cs \
locale-gstreamer-plugins-bad-da \
locale-gstreamer-plugins-bad-de \
locale-gstreamer-plugins-bad-el \
locale-gstreamer-plugins-bad-en-GB \
locale-gstreamer-plugins-bad-eo \
locale-gstreamer-plugins-bad-es \
locale-gstreamer-plugins-bad-eu \
locale-gstreamer-plugins-bad-fi \
locale-gstreamer-plugins-bad-fr \
locale-gstreamer-plugins-bad-fur \
locale-gstreamer-plugins-bad-gl \
locale-gstreamer-plugins-bad-hr \
locale-gstreamer-plugins-bad-hu \
locale-gstreamer-plugins-bad-id \
locale-gstreamer-plugins-bad-it \
locale-gstreamer-plugins-bad-ja \
locale-gstreamer-plugins-bad-ka \
locale-gstreamer-plugins-bad-lt \
locale-gstreamer-plugins-bad-lv \
locale-gstreamer-plugins-bad-nb \
locale-gstreamer-plugins-bad-nl \
locale-gstreamer-plugins-bad-or \
locale-gstreamer-plugins-bad-pl \
locale-gstreamer-plugins-bad-pt-BR \
locale-gstreamer-plugins-bad-ro \
locale-gstreamer-plugins-bad-ru \
locale-gstreamer-plugins-bad-sk \
locale-gstreamer-plugins-bad-sl \
locale-gstreamer-plugins-bad-sq \
locale-gstreamer-plugins-bad-sr \
locale-gstreamer-plugins-bad-sv \
locale-gstreamer-plugins-bad-tr \
locale-gstreamer-plugins-bad-uk \
locale-gstreamer-plugins-bad-vi \
locale-gstreamer-plugins-bad-zh-CN \
locale-gstreamer-plugins-bad-zh-TW"

RDEPENDS:${PN} += "gstreamer-plugins-bad"

inherit rpm
