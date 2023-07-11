SUMMARY = "Translations for package gpaste"
DESCRIPTION = "Provides translations for the 'gpaste' package."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-lang-43.2+6-2.2.noarch.rpm"
RPM_HASH = "1c324c633ec8856e8040dd1d1decdc766623b81da48f36a8d3ccdf13674a3d68eec6633a267e48038008f8dbe9587a17c94f56bb3bb72b20e9a04df49cd77404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-lang \
gpaste-lang-all \
locale-gpaste-ar \
locale-gpaste-cs \
locale-gpaste-de \
locale-gpaste-es \
locale-gpaste-fa \
locale-gpaste-fr \
locale-gpaste-gl \
locale-gpaste-it \
locale-gpaste-ja \
locale-gpaste-ka \
locale-gpaste-nb-NO \
locale-gpaste-oc \
locale-gpaste-pl \
locale-gpaste-pt-BR \
locale-gpaste-ru \
locale-gpaste-sl \
locale-gpaste-sv \
locale-gpaste-tr \
locale-gpaste-vi \
locale-gpaste-zh-CN \
locale-gpaste-zh-Hant"

RDEPENDS:${PN} += "gpaste"

inherit rpm
