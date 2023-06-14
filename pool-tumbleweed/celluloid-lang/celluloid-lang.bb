SUMMARY = "Translations for package celluloid"
DESCRIPTION = "Provides translations for the 'celluloid' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-lang-0.25-1.1.noarch.rpm"
RPM_HASH = "bab9740ec0eb314f6fa93fd979fb1e58527954f7e8d91f6fd8d0beaf07dbedd89e18bb0bca5bb420899b75ef8ac3faa818f4063c0a65626db60be48313cfe55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "celluloid-lang \
celluloid-lang-all \
locale-celluloid-ar \
locale-celluloid-bg \
locale-celluloid-ca \
locale-celluloid-cs \
locale-celluloid-da \
locale-celluloid-de \
locale-celluloid-el \
locale-celluloid-eo \
locale-celluloid-es \
locale-celluloid-et \
locale-celluloid-eu \
locale-celluloid-fa \
locale-celluloid-fi \
locale-celluloid-fr \
locale-celluloid-hr \
locale-celluloid-hu \
locale-celluloid-id \
locale-celluloid-is \
locale-celluloid-it \
locale-celluloid-ja \
locale-celluloid-ka \
locale-celluloid-ko \
locale-celluloid-lt \
locale-celluloid-ms \
locale-celluloid-nb-NO \
locale-celluloid-nl \
locale-celluloid-oc \
locale-celluloid-pl \
locale-celluloid-pt-BR \
locale-celluloid-pt-PT \
locale-celluloid-ro \
locale-celluloid-ru \
locale-celluloid-sk \
locale-celluloid-sl \
locale-celluloid-sr \
locale-celluloid-sr@latin \
locale-celluloid-sv \
locale-celluloid-ta \
locale-celluloid-te \
locale-celluloid-tr \
locale-celluloid-uk \
locale-celluloid-zh-CN \
locale-celluloid-zh-TW"

RDEPENDS:${PN} += "celluloid"

inherit rpm
