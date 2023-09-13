SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-nds-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "bc7b1e4fea07edd19a55caade8759f830f3fa604abf49f4b648337b4504f5b82ce1955e6d6d74af1083fef68d0c404a6978c25bfc22f9ed5791cd17aef055821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
