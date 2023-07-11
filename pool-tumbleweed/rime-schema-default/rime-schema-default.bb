SUMMARY = "Default/Preset collection of rime schemas"
DESCRIPTION = "Default/Preset collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-default-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "34fe3ff67e9ca071cc009fcdaac184fd42da35cc2d39b6752740f6505afe9b2de373cb78bd832637874be7f0cffd871496a6fcc131ab001c149b1c90b9d0ae9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-default"

RDEPENDS:${PN} += "rime-schema-bopomofo \
rime-schema-cangjie \
rime-schema-custom \
rime-schema-essay \
rime-schema-luna-pinyin \
rime-schema-prelude \
rime-schema-stroke \
rime-schema-terra-pinyin"

inherit rpm
