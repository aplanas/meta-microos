SUMMARY = "Translations for package gnucash"
DESCRIPTION = "Provides translations for the 'gnucash' package."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-lang-4.14-1.4.noarch.rpm"
RPM_HASH = "b4d57ac9ce825b996c494e42540081ba0bc32c6acbfb7f494ab8c029b8f8887f87f19b5f9de45a8edd656a1d55b8a0dd11f3c186d16d62005965d18781cfc575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-lang \
gnucash-lang-all \
locale-gnucash-ar \
locale-gnucash-as \
locale-gnucash-az \
locale-gnucash-bg \
locale-gnucash-ca \
locale-gnucash-cs \
locale-gnucash-da \
locale-gnucash-de \
locale-gnucash-el \
locale-gnucash-en-AU \
locale-gnucash-en-GB \
locale-gnucash-en-NZ \
locale-gnucash-es \
locale-gnucash-es-NI \
locale-gnucash-et \
locale-gnucash-eu \
locale-gnucash-fa \
locale-gnucash-fi \
locale-gnucash-fr \
locale-gnucash-gu \
locale-gnucash-he \
locale-gnucash-hi \
locale-gnucash-hr \
locale-gnucash-hu \
locale-gnucash-id \
locale-gnucash-it \
locale-gnucash-ja \
locale-gnucash-kn \
locale-gnucash-ko \
locale-gnucash-lt \
locale-gnucash-lv \
locale-gnucash-mai \
locale-gnucash-mk \
locale-gnucash-mr \
locale-gnucash-nb \
locale-gnucash-ne \
locale-gnucash-nl \
locale-gnucash-pl \
locale-gnucash-pt \
locale-gnucash-pt-BR \
locale-gnucash-ro \
locale-gnucash-ru \
locale-gnucash-sk \
locale-gnucash-sr \
locale-gnucash-sv \
locale-gnucash-ta \
locale-gnucash-te \
locale-gnucash-tr \
locale-gnucash-uk \
locale-gnucash-vi \
locale-gnucash-zh-CN \
locale-gnucash-zh-TW"

RDEPENDS:${PN} += "gnucash"

inherit rpm
