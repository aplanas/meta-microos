SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-fi-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "3215095cb32e60446ebe0a654ad708b28c9fcb5c497cc4b5c1533a16fef867ea13e7058861aa81faf70e8a4258356356b9e1806999d940824980389230e7e46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
