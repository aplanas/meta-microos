SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "22b37965628e013cea480dc52fc886e33041766c2fcb060808dfaf31e7391f3d0b370251bf17a63b3a504369528fc4f3a3630a388f9d06f165d150b7ec3dd77c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
