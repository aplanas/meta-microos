SUMMARY = "Translations for package baloo5-file"
DESCRIPTION = "Provides translations for the 'baloo5-file' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-file-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "3d4f56df84c9d6eadf6e7bbe43293fd2422d4bd40569d58f2d5b8a753af85d77b72db4c103a3f55a19fc62bd3e5c758038706d0186342f8d351212d741ef6308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo5-file-lang \
baloo5-file-lang-all \
locale-baloo5-file-ar \
locale-baloo5-file-az \
locale-baloo5-file-bg \
locale-baloo5-file-bs \
locale-baloo5-file-ca \
locale-baloo5-file-ca@valencia \
locale-baloo5-file-cs \
locale-baloo5-file-da \
locale-baloo5-file-de \
locale-baloo5-file-el \
locale-baloo5-file-en-GB \
locale-baloo5-file-es \
locale-baloo5-file-et \
locale-baloo5-file-eu \
locale-baloo5-file-fi \
locale-baloo5-file-fr \
locale-baloo5-file-gd \
locale-baloo5-file-gl \
locale-baloo5-file-hu \
locale-baloo5-file-ia \
locale-baloo5-file-id \
locale-baloo5-file-it \
locale-baloo5-file-ja \
locale-baloo5-file-ka \
locale-baloo5-file-ko \
locale-baloo5-file-lt \
locale-baloo5-file-ml \
locale-baloo5-file-nb \
locale-baloo5-file-nds \
locale-baloo5-file-nl \
locale-baloo5-file-nn \
locale-baloo5-file-pa \
locale-baloo5-file-pl \
locale-baloo5-file-pt \
locale-baloo5-file-pt-BR \
locale-baloo5-file-ro \
locale-baloo5-file-ru \
locale-baloo5-file-sk \
locale-baloo5-file-sl \
locale-baloo5-file-sr \
locale-baloo5-file-sr@ijekavian \
locale-baloo5-file-sr@ijekavianlatin \
locale-baloo5-file-sr@latin \
locale-baloo5-file-sv \
locale-baloo5-file-ta \
locale-baloo5-file-tr \
locale-baloo5-file-uk \
locale-baloo5-file-zh-CN \
locale-baloo5-file-zh-TW"

RDEPENDS:${PN} += "baloo5-file"

inherit rpm
