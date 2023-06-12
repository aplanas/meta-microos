SUMMARY = "Documentation for dar"
DESCRIPTION = "Documentation package for dar"
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.8"

RPM_NAME = "dar-doc-2.7.8-1.4.aarch64.rpm"
RPM_HASH = "97685963c633064fe2cf499258b60afd978d15e0711f6315f20f05747d115aaee0c191f2ab0c4fc8da99316e4e19ed8d37977eea18b6c171e00030534ac07590"

RPROVIDES:${PN} += "dar-doc \
dar-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
