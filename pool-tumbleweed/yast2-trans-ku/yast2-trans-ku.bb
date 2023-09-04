SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ku-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "a77df828a9d1ca3e14a1140846215ee1c98f0a6edbfa9de6113ed7bf9e02920d30735c8aac5d0a2c0cdfcdff35861f1f04ddbfd5f112ea0b7dd013621b55319c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
