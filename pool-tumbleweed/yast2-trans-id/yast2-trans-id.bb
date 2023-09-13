SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-id-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "ac9d026bcebdc8a1ba307a99348f3616d2ff80d8b1dd2c61bd21a2eaa388792f4114baec675643e4e3dc94dda1e991cf6f06df20e0cb3da66a79b914c485c92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
