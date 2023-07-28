SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-tg-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "e87c360b62f6122055ecaa78744d8ba0b64b63bddc40a1859388a140c943752913260ee5081355f8e71ed36fb789b31c08d10cbf0784d04f9db8d2e655842882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
