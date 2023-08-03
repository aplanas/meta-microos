SUMMARY = "Translations for package tcsh"
DESCRIPTION = "Provides translations for the 'tcsh' package."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-lang-6.24.10-3.1.noarch.rpm"
RPM_HASH = "3713b4743b1043f4671dd61d6ad37b03d94e8182c01ca796d526a8e0fe917ab6b3e8cc4f33bbdbaf12611f3a84a7f7b36d03829b64d666e9a335c771e9d23bbd"
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
