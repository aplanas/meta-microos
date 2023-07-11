SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-zu-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "00e91c6beedd7f0e5b0a3a2f1b666e6ed84a19d8195adf1a76ca3be8adb6c5ba0ceacd76202ac8ce6d943b1f23793784cebca04010110bbc155427343e9302ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
