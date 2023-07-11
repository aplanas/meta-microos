SUMMARY = "Language translations for authselect"
DESCRIPTION = "This package contains the language translation files for authselect"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-lang-1.4.0+git.0.2c30265-3.3.aarch64.rpm"
RPM_HASH = "4a1c9429e5ac581453dc5065f5a1e1910525b4da92a283621fdf2fb3ebed8ee4e95bdce9515242f50c6ae633582beba6363b8efd9ad891851bef57ff69009eaf"

RPROVIDES:${PN} += "authselect-lang \
locale-authselect-ca \
locale-authselect-cs \
locale-authselect-de \
locale-authselect-es \
locale-authselect-fa \
locale-authselect-fi \
locale-authselect-fr \
locale-authselect-hu \
locale-authselect-id \
locale-authselect-it \
locale-authselect-ja \
locale-authselect-ka \
locale-authselect-ko \
locale-authselect-nl \
locale-authselect-pl \
locale-authselect-pt \
locale-authselect-pt-BR \
locale-authselect-ru \
locale-authselect-si \
locale-authselect-sv \
locale-authselect-tr \
locale-authselect-uk \
locale-authselect-zh-CN \
locale-authselect-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
