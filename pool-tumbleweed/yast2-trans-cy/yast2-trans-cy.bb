SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-cy-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "b75142a0ae0a68734394896e6dc726a4796c86fbaba3e3eb300b884e0a363d2afcc06bbdc42498a2cf6ee4f2ecfae65c4a6332beb013947849b043744858a07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm
