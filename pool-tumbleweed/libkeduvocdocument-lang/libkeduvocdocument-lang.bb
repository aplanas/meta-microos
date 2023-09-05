SUMMARY = "Translations for package libkeduvocdocument"
DESCRIPTION = "Provides translations for the 'libkeduvocdocument' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkeduvocdocument-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "4636186d1d5e23b82547da5f6c38dc4f3e387a53a9db6278f4d58726ff0969d8ec6effde0690d9d82896e45e051972fc1fd5b1fcd64e8c2a717f26fb8f1406d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkeduvocdocument-lang \
libkeduvocdocument-lang-all \
locale-libkeduvocdocument-ar \
locale-libkeduvocdocument-az \
locale-libkeduvocdocument-be \
locale-libkeduvocdocument-bg \
locale-libkeduvocdocument-br \
locale-libkeduvocdocument-bs \
locale-libkeduvocdocument-ca \
locale-libkeduvocdocument-ca@valencia \
locale-libkeduvocdocument-cs \
locale-libkeduvocdocument-cy \
locale-libkeduvocdocument-da \
locale-libkeduvocdocument-de \
locale-libkeduvocdocument-el \
locale-libkeduvocdocument-en-GB \
locale-libkeduvocdocument-eo \
locale-libkeduvocdocument-es \
locale-libkeduvocdocument-et \
locale-libkeduvocdocument-eu \
locale-libkeduvocdocument-fa \
locale-libkeduvocdocument-fi \
locale-libkeduvocdocument-fr \
locale-libkeduvocdocument-ga \
locale-libkeduvocdocument-gl \
locale-libkeduvocdocument-he \
locale-libkeduvocdocument-hi \
locale-libkeduvocdocument-hr \
locale-libkeduvocdocument-hu \
locale-libkeduvocdocument-is \
locale-libkeduvocdocument-it \
locale-libkeduvocdocument-ja \
locale-libkeduvocdocument-ka \
locale-libkeduvocdocument-kk \
locale-libkeduvocdocument-km \
locale-libkeduvocdocument-ko \
locale-libkeduvocdocument-lt \
locale-libkeduvocdocument-lv \
locale-libkeduvocdocument-mai \
locale-libkeduvocdocument-mk \
locale-libkeduvocdocument-ml \
locale-libkeduvocdocument-mr \
locale-libkeduvocdocument-ms \
locale-libkeduvocdocument-nb \
locale-libkeduvocdocument-nds \
locale-libkeduvocdocument-ne \
locale-libkeduvocdocument-nl \
locale-libkeduvocdocument-nn \
locale-libkeduvocdocument-oc \
locale-libkeduvocdocument-pa \
locale-libkeduvocdocument-pl \
locale-libkeduvocdocument-pt \
locale-libkeduvocdocument-pt-BR \
locale-libkeduvocdocument-ro \
locale-libkeduvocdocument-ru \
locale-libkeduvocdocument-si \
locale-libkeduvocdocument-sk \
locale-libkeduvocdocument-sl \
locale-libkeduvocdocument-sq \
locale-libkeduvocdocument-sv \
locale-libkeduvocdocument-th \
locale-libkeduvocdocument-tr \
locale-libkeduvocdocument-ug \
locale-libkeduvocdocument-uk \
locale-libkeduvocdocument-vi \
locale-libkeduvocdocument-zh-CN \
locale-libkeduvocdocument-zh-TW"

RDEPENDS:${PN} += "libkeduvocdocument"

inherit rpm
