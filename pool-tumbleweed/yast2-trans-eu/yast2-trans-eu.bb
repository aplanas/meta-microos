SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-eu-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "374a70aa0c1e6328b7a90bfd0bcb6acc51bde6752648a0a11ed33623953e16ec1d1ab15c3fcee6b8841deca835e7d742a8244b43813ad506e818290975b9e66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:eu) \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
