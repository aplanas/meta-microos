SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ast-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "988686ede1746d5922e85503ebdeca2146858d6c9ffdc829c20dbbdd3ff940948b1bc46291dbb3af134bbe8255a69a847646b366ebd717398c800fdbc65fb66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
