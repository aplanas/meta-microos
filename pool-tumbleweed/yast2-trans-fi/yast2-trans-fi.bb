SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-fi-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "b7be35167d1fd402b21fc9109af8fd33666bf7ab3505dd7125ef19b2a06c9be0e665a6c6e8e366417d9defe4b299d229b6a6c34ee15437071ec82ca55cc5de4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
