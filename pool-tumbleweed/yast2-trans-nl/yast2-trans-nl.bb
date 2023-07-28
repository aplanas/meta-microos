SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-nl-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "52391b5896c882f7e0e0a342480e34a896c0c04568b45dba8bd49c23c264a8ede13307aef9cd9576cd0ed7f528350828eec966057c28fbac2f59dad754f2fb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
