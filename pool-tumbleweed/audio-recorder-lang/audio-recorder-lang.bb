SUMMARY = "Translations for package audio-recorder"
DESCRIPTION = "Provides translations for the 'audio-recorder' package."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "audio-recorder-lang-3.3.4-1.6.noarch.rpm"
RPM_HASH = "f64d73ebda095409b1c11fb84f41af0267103b5d32e542554bea551fe07401ed02ec2423a8b2400aa092817f38f2975a14df73101709b5f6fb091bb3822d5c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audio-recorder-lang \
audio-recorder-lang-all \
locale-audio-recorder-af \
locale-audio-recorder-ar \
locale-audio-recorder-ca \
locale-audio-recorder-cs \
locale-audio-recorder-de \
locale-audio-recorder-el \
locale-audio-recorder-en-AU \
locale-audio-recorder-en-GB \
locale-audio-recorder-es \
locale-audio-recorder-eu \
locale-audio-recorder-fi \
locale-audio-recorder-fr \
locale-audio-recorder-gl \
locale-audio-recorder-he \
locale-audio-recorder-hr \
locale-audio-recorder-hu \
locale-audio-recorder-it \
locale-audio-recorder-lt \
locale-audio-recorder-ms \
locale-audio-recorder-nb \
locale-audio-recorder-nl \
locale-audio-recorder-pl \
locale-audio-recorder-pt \
locale-audio-recorder-pt-BR \
locale-audio-recorder-ru \
locale-audio-recorder-sk \
locale-audio-recorder-sr \
locale-audio-recorder-sv \
locale-audio-recorder-tr \
locale-audio-recorder-uk \
locale-audio-recorder-vi \
locale-audio-recorder-zh-CN \
locale-audio-recorder-zh-TW"

RDEPENDS:${PN} += "audio-recorder"

inherit rpm
