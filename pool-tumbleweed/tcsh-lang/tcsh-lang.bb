SUMMARY = "Translations for package tcsh"
DESCRIPTION = "Provides translations for the 'tcsh' package."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-lang-6.24.10-2.1.noarch.rpm"
RPM_HASH = "2d5cfca2344203a42a42bee6849ffa4c18fc306d758c642fd0dd49879ff3ecc2c439b4f263b86686af874ed5ada814e10b9868a279394adcca8225e6f43d1d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tcsh-de \
locale-tcsh-el \
locale-tcsh-el-GR \
locale-tcsh-es \
locale-tcsh-et \
locale-tcsh-fi \
locale-tcsh-fr \
locale-tcsh-it \
locale-tcsh-ja \
locale-tcsh-pl \
locale-tcsh-ru-RU \
locale-tcsh-ru-UA.koi8u \
locale-tcsh-uk-UA \
tcsh-lang \
tcsh-lang-all"

RDEPENDS:${PN} += "tcsh"

inherit rpm
