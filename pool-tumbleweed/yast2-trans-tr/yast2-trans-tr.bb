SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-tr-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "f9195f2b74887f1dce88acc72141c0fdce0d19cad0c7968d02bc804600b0d973e2ab26ea5979878db6e54fd21e241eb1a11374b4a48846415f8ce6535febc867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
