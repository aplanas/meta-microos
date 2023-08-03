SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-nn-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "b9122ff38e57e1fc636e602b0dc5055503f5b7f411bf866bc27b19e88f3191b3ae8ba3cdd51b08eeb1e36da2a9a60423bd8ccd4954195332765d1ad9316bec2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
