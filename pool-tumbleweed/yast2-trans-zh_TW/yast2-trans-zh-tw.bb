SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "4b1ae3a1af4b70f6fcca25325546b18673c5fa460b649a8af6ec8f45cc7dfc92108aa2d9628dcd7ae69d36aae64673fbaa8393ebebfabc890c13ddedac3396d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
