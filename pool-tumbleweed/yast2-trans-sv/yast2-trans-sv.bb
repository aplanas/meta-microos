SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sv-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "6ec67fcbe941a908dbe15228d23c0d06becdd9c0ffb389e70c87e3271765f8f7345c20a1973745d9d072e3bd1dd12e8653aa7b2cb04e877af5194a5f73891005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
