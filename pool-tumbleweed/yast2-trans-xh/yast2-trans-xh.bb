SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-xh-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "c4acf8fb3493146f869259ef74ea4f43c6f377dab2a1fd7aab8558421594f4e9f08442415629dffea50ddf0a369cf45cbd6e799bf63469a2972dfe2fb8de8f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
