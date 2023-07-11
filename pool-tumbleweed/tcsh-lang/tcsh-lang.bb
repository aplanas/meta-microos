SUMMARY = "Translations for package tcsh"
DESCRIPTION = "Provides translations for the 'tcsh' package."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-lang-6.24.10-1.2.noarch.rpm"
RPM_HASH = "f000550f07b94805415721d726c95203ad465e191debc0ff785c1f9fd32d2717f1a7c64f5aa8f76cedc01b0cb1e822880063b4dbfc612a0a715922d925eba056"
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
