SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ku-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "e0927beb7c38c9a951ac6a39ad525168bf6798f601cea4e80907249151f3c9f5bf1831a35c4f4c45b99b48c31197256779098cc4797e1f5eb41dc5c52d51a9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
