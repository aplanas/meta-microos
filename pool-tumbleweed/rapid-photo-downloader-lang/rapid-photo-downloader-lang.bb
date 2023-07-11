SUMMARY = "Translations for package rapid-photo-downloader"
DESCRIPTION = "Provides translations for the 'rapid-photo-downloader' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.34"

RPM_NAME = "rapid-photo-downloader-lang-0.9.34-2.2.noarch.rpm"
RPM_HASH = "0e2ae2aaf49863f3cd42355a92b34f7f53dd27c8203b027531a898bed75df779c0303d975f473de97aaae1bf8043ee4630f8e86244702b1a25d2c3c8a39dc647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rapid-photo-downloader-ar \
locale-rapid-photo-downloader-be \
locale-rapid-photo-downloader-bg \
locale-rapid-photo-downloader-ca \
locale-rapid-photo-downloader-cs \
locale-rapid-photo-downloader-da \
locale-rapid-photo-downloader-de \
locale-rapid-photo-downloader-el \
locale-rapid-photo-downloader-es \
locale-rapid-photo-downloader-et \
locale-rapid-photo-downloader-fa \
locale-rapid-photo-downloader-fi \
locale-rapid-photo-downloader-fr \
locale-rapid-photo-downloader-hr \
locale-rapid-photo-downloader-hu \
locale-rapid-photo-downloader-id \
locale-rapid-photo-downloader-it \
locale-rapid-photo-downloader-ja \
locale-rapid-photo-downloader-nb \
locale-rapid-photo-downloader-nl \
locale-rapid-photo-downloader-nn \
locale-rapid-photo-downloader-oc \
locale-rapid-photo-downloader-pl \
locale-rapid-photo-downloader-pt \
locale-rapid-photo-downloader-pt-BR \
locale-rapid-photo-downloader-ro \
locale-rapid-photo-downloader-ru \
locale-rapid-photo-downloader-sk \
locale-rapid-photo-downloader-sq \
locale-rapid-photo-downloader-sr \
locale-rapid-photo-downloader-sv \
locale-rapid-photo-downloader-tr \
locale-rapid-photo-downloader-uk \
locale-rapid-photo-downloader-zh-CN \
rapid-photo-downloader-lang \
rapid-photo-downloader-lang-all"

RDEPENDS:${PN} += "rapid-photo-downloader"

inherit rpm
