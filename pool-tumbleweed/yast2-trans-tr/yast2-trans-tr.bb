SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-tr-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "9b8d30bee356e0641a6f92342de72aaf792c6ecb9b680e84869364ab08d454331cd48a053d63aef382cc8074164daf2249a4411d59ff88296e3afc546d86c9e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
