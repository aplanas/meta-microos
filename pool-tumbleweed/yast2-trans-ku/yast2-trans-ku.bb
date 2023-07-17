SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ku-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "820657c64277815a2ac663bfbe904fecbb554ea6b4657f34403f4e7f8947d7ca747be4fd9f7e637288176a0fbe0332ab2f76bf3ecaad221de44be0b26b0d11a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
