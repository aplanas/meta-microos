SUMMARY = "An OBS source service: create product media build descriptions"
DESCRIPTION = "Use this product converter to create product builds for openSUSE Tumbleweed or \
SLE 15."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "obs-service-product_converter-1.5.4-1.1.noarch.rpm"
RPM_HASH = "9fad14c8037e5db253b2944bb9a800b4e19092d1cac00137c40317ec09825cb73c7d0034699dd70bf12d12e33971d69f27bb6f0c5a505bc3f3ccb8fd69e90f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-product-converter \
perl-BSKiwiXML \
perl-BSProductXML \
perl-BSUtil \
perl-BSXML"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
perl-XML--Structured \
perl-XML-Parser \
perl-XML-Structured"

inherit rpm
