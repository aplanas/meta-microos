SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-jv-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "383f4f4f45ed0ba6e6cf7eb609e3044983c49c130dd84dfc09155057eefc168bc7803644b5323352364e22c21843ffaf61be7d1f41d6b9060cd84c3fb9c9c024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
