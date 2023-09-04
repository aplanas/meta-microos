SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sq-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "53dd7f659d32dfb8978e8e8bc60b9ade3f6a50ef5aa0cb11ce240a7176fcc49b9157e0163214535ee6bfe890a47c4125d930ea39fdbc1c4b9c7713b59c17acca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm
