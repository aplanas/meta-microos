SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ca-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "16808a1658536022da369fad1cef7a329f4c0efeaa55775149f5c68a21e1d1223e86072036d7d2f3e99c8c7a35315c52fa98b059484f534f91f57b26fa670161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
