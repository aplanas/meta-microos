SUMMARY = "Translations for package libbytesize"
DESCRIPTION = "Provides translations for the 'libbytesize' package."
LICENSE = "LGPL-2.1-only"

PV = "2.9"

RPM_NAME = "libbytesize-lang-2.9-1.1.noarch.rpm"
RPM_HASH = "a4d78ac4d62060abf210ae10e501d8ec87b3e274864d9b2b6efdecbc60b5f8fbdb482248f1bfb9faea3e7ef29c858be81aaf628d6dad469f113430eecfa26456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbytesize-lang \
libbytesize-lang-all \
locale-libbytesize-ast \
locale-libbytesize-be \
locale-libbytesize-bn-IN \
locale-libbytesize-ca \
locale-libbytesize-cs \
locale-libbytesize-da \
locale-libbytesize-de \
locale-libbytesize-es \
locale-libbytesize-fi \
locale-libbytesize-fr \
locale-libbytesize-fur \
locale-libbytesize-he \
locale-libbytesize-hr \
locale-libbytesize-hu \
locale-libbytesize-id \
locale-libbytesize-it \
locale-libbytesize-ka \
locale-libbytesize-kk \
locale-libbytesize-ko \
locale-libbytesize-nl \
locale-libbytesize-nn \
locale-libbytesize-pl \
locale-libbytesize-pt \
locale-libbytesize-pt-BR \
locale-libbytesize-ru \
locale-libbytesize-si \
locale-libbytesize-sk \
locale-libbytesize-sq \
locale-libbytesize-sv \
locale-libbytesize-tr \
locale-libbytesize-uk \
locale-libbytesize-zh-CN \
locale-libbytesize-zh-TW"

RDEPENDS:${PN} += "libbytesize"

inherit rpm
