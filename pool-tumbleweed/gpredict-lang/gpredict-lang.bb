SUMMARY = "Translations for package gpredict"
DESCRIPTION = "Provides translations for the 'gpredict' package."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "gpredict-lang-2.2.1-2.16.noarch.rpm"
RPM_HASH = "18ddce7a42361f1d215e8ca2e9a949ffaec5490d31af69f21c09b9c5dd64f5e46a1ee101077e7ce247724a143a7a5b9a1e6cafa5e0b110abeb712ae8b6dad12a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpredict-lang \
gpredict-lang-all \
locale-gpredict-cs \
locale-gpredict-da \
locale-gpredict-de \
locale-gpredict-el \
locale-gpredict-en-GB \
locale-gpredict-en-US \
locale-gpredict-es \
locale-gpredict-fi \
locale-gpredict-fr \
locale-gpredict-id \
locale-gpredict-it \
locale-gpredict-lt \
locale-gpredict-ru \
locale-gpredict-th \
locale-gpredict-uk"

RDEPENDS:${PN} += "gpredict"

inherit rpm
