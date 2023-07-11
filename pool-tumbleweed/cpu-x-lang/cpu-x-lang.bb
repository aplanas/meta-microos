SUMMARY = "Translations for package cpu-x"
DESCRIPTION = "Provides translations for the 'cpu-x' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-lang-4.5.3-1.2.noarch.rpm"
RPM_HASH = "efc51ba48c1a4edf5007585487c2107190aebe573db388e6616866f3e2ebc1d3ab2cbd47c430b6c3131fe229ff7f0095a7081a51e1044b1e8eb1829d03ac88f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-lang \
cpu-x-lang-all \
locale-cpu-x-ar \
locale-cpu-x-bg \
locale-cpu-x-ca \
locale-cpu-x-cs-CZ \
locale-cpu-x-da \
locale-cpu-x-de \
locale-cpu-x-el \
locale-cpu-x-es \
locale-cpu-x-fa \
locale-cpu-x-fi \
locale-cpu-x-fr \
locale-cpu-x-hu \
locale-cpu-x-id \
locale-cpu-x-it \
locale-cpu-x-ja \
locale-cpu-x-ka \
locale-cpu-x-ko \
locale-cpu-x-lv \
locale-cpu-x-ml \
locale-cpu-x-mr \
locale-cpu-x-ms \
locale-cpu-x-nb-NO \
locale-cpu-x-nl \
locale-cpu-x-pa \
locale-cpu-x-pl \
locale-cpu-x-pt \
locale-cpu-x-pt-BR \
locale-cpu-x-ro \
locale-cpu-x-ru \
locale-cpu-x-si \
locale-cpu-x-sv \
locale-cpu-x-ta \
locale-cpu-x-tr \
locale-cpu-x-uk \
locale-cpu-x-zh \
locale-cpu-x-zh-Hant"

RDEPENDS:${PN} += "cpu-x"

inherit rpm
