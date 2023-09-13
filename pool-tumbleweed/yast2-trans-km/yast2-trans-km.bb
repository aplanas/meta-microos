SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-km-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "f6af004d6133fdfc1e0df6ee64122fd86761ea5b6c12ccc9c27b23faa085b0a402636ed389469b94f16f6e688c490b88eb6a6ed71ac4431fe048025ad8db88fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
