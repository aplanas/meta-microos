SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-vi-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "5afeb0a3a501214d7f46ecaa335dbd411e6fdc4c4a8a6b04d7f0f277e512ac4a366f5b6f371ad5bffc5f4121cf2499daca299c964fd55f6ad17a5f16c4164352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
