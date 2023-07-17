SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "967e1bcd668a35ffffb948c4cf9424782f24ae432288c0db5498032b4e6e1467ee52775a10aed0fec328d95680c95a08bbd43b705059ee283e4692e6fb3ab283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
