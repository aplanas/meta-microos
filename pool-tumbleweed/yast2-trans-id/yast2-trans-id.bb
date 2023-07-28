SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-id-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "29f22bc191edb80b9bc32a10e800457c5db99688aa36bf515e7dc770ab170c59113a909acc2d396d3fdb8be5b368fa1a405627c16e5b79fdd3e5e17373ec2a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
