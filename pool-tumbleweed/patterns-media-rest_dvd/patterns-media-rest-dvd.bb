SUMMARY = "Remaining Software"
DESCRIPTION = "Packages that are on CD but not in other patterns."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-media-rest_dvd-20170319-43.1.aarch64.rpm"
RPM_HASH = "6753174ac86c70714a5120204734b84f874fe5fc6ef47ae08704e4d34b4daf5080e744f31edf05867ebe8c70f6d5c6608fa2391e81ff46275384db90c001be3c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-media-rest-dvd \
patterns-openSUSE-rest-dvd"

RDEPENDS:${PN} += "arabic-fonts \
arphic-uming-fonts \
breeze5-wallpapers \
cracklib-dict-full \
indic-fonts \
ipa-gothic-fonts \
khmeros-fonts \
lklug-fonts \
pattern- \
thai-fonts \
udftools \
un-fonts \
yast2-trans-af \
yast2-trans-ar \
yast2-trans-bg \
yast2-trans-bn \
yast2-trans-bs \
yast2-trans-ca \
yast2-trans-cs \
yast2-trans-cy \
yast2-trans-da \
yast2-trans-de \
yast2-trans-el \
yast2-trans-en-GB \
yast2-trans-es \
yast2-trans-et \
yast2-trans-fa \
yast2-trans-fi \
yast2-trans-fr \
yast2-trans-gl \
yast2-trans-gu \
yast2-trans-hi \
yast2-trans-hr \
yast2-trans-hu \
yast2-trans-id \
yast2-trans-it \
yast2-trans-ja \
yast2-trans-jv \
yast2-trans-ka \
yast2-trans-km \
yast2-trans-ko \
yast2-trans-lo \
yast2-trans-lt \
yast2-trans-mk \
yast2-trans-mr \
yast2-trans-nb \
yast2-trans-nl \
yast2-trans-pa \
yast2-trans-pl \
yast2-trans-pt \
yast2-trans-pt-BR \
yast2-trans-ro \
yast2-trans-ru \
yast2-trans-si \
yast2-trans-sk \
yast2-trans-sl \
yast2-trans-sr \
yast2-trans-sv \
yast2-trans-ta \
yast2-trans-th \
yast2-trans-tr \
yast2-trans-uk \
yast2-trans-vi \
yast2-trans-wa \
yast2-trans-xh \
yast2-trans-zh-CN \
yast2-trans-zh-TW \
yast2-trans-zu"

inherit rpm
