SUMMARY = "Translations for package libKPipeWire5"
DESCRIPTION = "Provides translations for the 'libKPipeWire5' package."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "libKPipeWire5-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "a48ca65d771a1c13794a13cc76d935aac347aa0f2fcfe290fcbb3051559fc16d80e4658fb7e4c97cc7d313afdb21d289b707c01dfd8474ac820dd43df338b5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPipeWire5-lang \
libKPipeWire5-lang-all \
locale-libKPipeWire5-ar \
locale-libKPipeWire5-ca \
locale-libKPipeWire5-ca@valencia \
locale-libKPipeWire5-cs \
locale-libKPipeWire5-de \
locale-libKPipeWire5-en-GB \
locale-libKPipeWire5-es \
locale-libKPipeWire5-eu \
locale-libKPipeWire5-fi \
locale-libKPipeWire5-fr \
locale-libKPipeWire5-gl \
locale-libKPipeWire5-id \
locale-libKPipeWire5-it \
locale-libKPipeWire5-ja \
locale-libKPipeWire5-ka \
locale-libKPipeWire5-ko \
locale-libKPipeWire5-nl \
locale-libKPipeWire5-nn \
locale-libKPipeWire5-pa \
locale-libKPipeWire5-pl \
locale-libKPipeWire5-pt \
locale-libKPipeWire5-pt-BR \
locale-libKPipeWire5-ro \
locale-libKPipeWire5-ru \
locale-libKPipeWire5-sk \
locale-libKPipeWire5-sl \
locale-libKPipeWire5-sv \
locale-libKPipeWire5-ta \
locale-libKPipeWire5-tr \
locale-libKPipeWire5-uk \
locale-libKPipeWire5-zh-CN \
locale-libKPipeWire5-zh-TW"

RDEPENDS:${PN} += "libKPipeWire5"

inherit rpm
