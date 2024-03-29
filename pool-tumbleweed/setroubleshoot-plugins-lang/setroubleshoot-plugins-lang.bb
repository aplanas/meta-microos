SUMMARY = "Translations for package setroubleshoot-plugins"
DESCRIPTION = "Provides translations for the 'setroubleshoot-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.14"

RPM_NAME = "setroubleshoot-plugins-lang-3.3.14-1.3.noarch.rpm"
RPM_HASH = "e428de9aa0ce31bdafa26a6542b2f5ec12fb01a13d094d29964c22e8254cdb90bf40e11533158c7e33ef99277b2faed07f67582389bf9a9d1a7b3e86562c2227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-setroubleshoot-plugins-as \
locale-setroubleshoot-plugins-bg \
locale-setroubleshoot-plugins-bn \
locale-setroubleshoot-plugins-bn-IN \
locale-setroubleshoot-plugins-ca \
locale-setroubleshoot-plugins-cs \
locale-setroubleshoot-plugins-da \
locale-setroubleshoot-plugins-de \
locale-setroubleshoot-plugins-el \
locale-setroubleshoot-plugins-en-GB \
locale-setroubleshoot-plugins-es \
locale-setroubleshoot-plugins-eu \
locale-setroubleshoot-plugins-fi \
locale-setroubleshoot-plugins-fr \
locale-setroubleshoot-plugins-fur \
locale-setroubleshoot-plugins-gl \
locale-setroubleshoot-plugins-gu \
locale-setroubleshoot-plugins-he \
locale-setroubleshoot-plugins-hi \
locale-setroubleshoot-plugins-hr \
locale-setroubleshoot-plugins-hu \
locale-setroubleshoot-plugins-it \
locale-setroubleshoot-plugins-ja \
locale-setroubleshoot-plugins-kn \
locale-setroubleshoot-plugins-ko \
locale-setroubleshoot-plugins-mai \
locale-setroubleshoot-plugins-ml \
locale-setroubleshoot-plugins-mr \
locale-setroubleshoot-plugins-ms \
locale-setroubleshoot-plugins-nb-NO \
locale-setroubleshoot-plugins-nds \
locale-setroubleshoot-plugins-nl \
locale-setroubleshoot-plugins-nn \
locale-setroubleshoot-plugins-or \
locale-setroubleshoot-plugins-pa \
locale-setroubleshoot-plugins-pl \
locale-setroubleshoot-plugins-pt \
locale-setroubleshoot-plugins-pt-BR \
locale-setroubleshoot-plugins-ru \
locale-setroubleshoot-plugins-si \
locale-setroubleshoot-plugins-sk \
locale-setroubleshoot-plugins-sr \
locale-setroubleshoot-plugins-sv \
locale-setroubleshoot-plugins-ta \
locale-setroubleshoot-plugins-te \
locale-setroubleshoot-plugins-th \
locale-setroubleshoot-plugins-tr \
locale-setroubleshoot-plugins-uk \
locale-setroubleshoot-plugins-zh-CN \
locale-setroubleshoot-plugins-zh-TW \
setroubleshoot-plugins-lang \
setroubleshoot-plugins-lang-all"

RDEPENDS:${PN} += "setroubleshoot-plugins"

inherit rpm
