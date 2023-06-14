SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-th-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "eb6bdb0374fad4b3bca63a4f313b94ebc3b10a7ab81ff0192eb823c43562c5af6fab8b6ed816ac76f4aa3499378619505ae92100d2845129ee71d1c6d7fa717c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
