SUMMARY = "Translations for package shotwell"
DESCRIPTION = "Provides translations for the 'shotwell' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.32.1"

RPM_NAME = "shotwell-lang-0.32.1-1.2.noarch.rpm"
RPM_HASH = "87e9f34409f2890c35c47ca225aff1706b8ca09e9fb9cef70b297dd5d34521b3c020b678f5aa64ab2b65796079322dc0a86cadc0c70253f7fae1b5d87bd159bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-shotwell-af \
locale-shotwell-ar \
locale-shotwell-as \
locale-shotwell-ast \
locale-shotwell-bg \
locale-shotwell-bn \
locale-shotwell-bn-IN \
locale-shotwell-bs \
locale-shotwell-ca \
locale-shotwell-cs \
locale-shotwell-da \
locale-shotwell-de \
locale-shotwell-el \
locale-shotwell-en-GB \
locale-shotwell-eo \
locale-shotwell-es \
locale-shotwell-et \
locale-shotwell-eu \
locale-shotwell-fi \
locale-shotwell-fr \
locale-shotwell-gd \
locale-shotwell-gl \
locale-shotwell-gu \
locale-shotwell-he \
locale-shotwell-hi \
locale-shotwell-hr \
locale-shotwell-hu \
locale-shotwell-ia \
locale-shotwell-id \
locale-shotwell-it \
locale-shotwell-ja \
locale-shotwell-ka \
locale-shotwell-kk \
locale-shotwell-km \
locale-shotwell-kn \
locale-shotwell-ko \
locale-shotwell-lt \
locale-shotwell-lv \
locale-shotwell-mk \
locale-shotwell-ml \
locale-shotwell-mr \
locale-shotwell-nb \
locale-shotwell-nl \
locale-shotwell-nn \
locale-shotwell-oc \
locale-shotwell-or \
locale-shotwell-pa \
locale-shotwell-pl \
locale-shotwell-pt \
locale-shotwell-pt-BR \
locale-shotwell-ro \
locale-shotwell-ru \
locale-shotwell-sk \
locale-shotwell-sl \
locale-shotwell-sr \
locale-shotwell-sr@latin \
locale-shotwell-sv \
locale-shotwell-ta \
locale-shotwell-te \
locale-shotwell-th \
locale-shotwell-tr \
locale-shotwell-uk \
locale-shotwell-vi \
locale-shotwell-zh-CN \
locale-shotwell-zh-HK \
locale-shotwell-zh-TW \
shotwell-lang \
shotwell-lang-all"

RDEPENDS:${PN} += "shotwell"

inherit rpm
