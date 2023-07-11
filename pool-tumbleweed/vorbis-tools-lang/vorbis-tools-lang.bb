SUMMARY = "Translations for package vorbis-tools"
DESCRIPTION = "Provides translations for the 'vorbis-tools' package."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "vorbis-tools-lang-1.4.2-1.12.noarch.rpm"
RPM_HASH = "26ccfd4f2233c7e7f8948f22f02ba380a383ed7a834dacb3013b71146376b8994dbe2e72d10aa99a5d9d581d04d6a9f5f0db5d23278ba582e7d8c3054c5f9fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vorbis-tools-be \
locale-vorbis-tools-cs \
locale-vorbis-tools-da \
locale-vorbis-tools-en-GB \
locale-vorbis-tools-eo \
locale-vorbis-tools-es \
locale-vorbis-tools-fr \
locale-vorbis-tools-hr \
locale-vorbis-tools-hu \
locale-vorbis-tools-nl \
locale-vorbis-tools-pl \
locale-vorbis-tools-ro \
locale-vorbis-tools-ru \
locale-vorbis-tools-sk \
locale-vorbis-tools-sv \
locale-vorbis-tools-uk \
locale-vorbis-tools-vi \
vorbis-tools-lang \
vorbis-tools-lang-all"

RDEPENDS:${PN} += "vorbis-tools"

inherit rpm
