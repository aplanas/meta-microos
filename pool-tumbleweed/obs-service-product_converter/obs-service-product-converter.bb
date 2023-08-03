SUMMARY = "An OBS source service: create product media build descriptions"
DESCRIPTION = "Use this product converter to create product builds for openSUSE Tumbleweed or \
SLE 15."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "obs-service-product_converter-1.5.5-1.1.noarch.rpm"
RPM_HASH = "f9eb9487b25ced17fdb163c72bf4d9493029cc68f08ef6abb977bc6837c171859d0137a93e76b963a1772a77c1b6107de68b95a3a1d6a34d0bee773f6de57532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-product-converter \
perl-BSKiwiXML \
perl-BSProductXML \
perl-BSUtil \
perl-BSXML"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-XML--Structured \
perl-XML-Parser \
perl-XML-Structured"

inherit rpm
