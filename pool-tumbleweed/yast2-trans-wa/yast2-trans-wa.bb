SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-wa-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "453f2c86b319c3753ea70364f8afe42080a7c4fa9777e5660d077b40a13c6c148c6ed84c0618ccd572314c38d95f393fefa3da8674c74d973692f0e3f4043ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
