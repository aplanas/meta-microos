SUMMARY = "Translations for package libbytesize"
DESCRIPTION = "Provides translations for the 'libbytesize' package."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize-lang-2.8-1.2.noarch.rpm"
RPM_HASH = "13321642f632ff6d349d287a991b5a528efc9e3cd65a3479643c87f7017e59b7ebdb34d85f1db29a19473fe2364d5a41221613a2e53326d9a8882b15614341e6"
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
