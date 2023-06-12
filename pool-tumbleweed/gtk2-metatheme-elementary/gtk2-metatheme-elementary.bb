SUMMARY = "GTK+ 2 support for the Elementary GTK theme"
DESCRIPTION = "The official elementary GTK theme designed to be smooth, attractive, fast, \
and usable. \
 \
This package provides the GTK+ 2 support of Elementary."
LICENSE = "GPL-3.0-only"

PV = "5.3.0"

RPM_NAME = "gtk2-metatheme-elementary-5.3.0-1.10.noarch.rpm"
RPM_HASH = "c662c1db26aad9a831e0f971fedbd7c1b730d265c94ee4c3850dbdea5b21751fd969b4da1d131be2783d558bed14c87fb26cffadc755a5654ed8f666504bbb33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-elementary"
RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-elementary-common"

inherit rpm
