SUMMARY = "An OBS source service: create product media build descriptions"
DESCRIPTION = "Use this product converter to create product builds for openSUSE Tumbleweed or \
SLE 15."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "obs-service-product_converter-1.5.6-1.1.noarch.rpm"
RPM_HASH = "4a1f39431d2a7826ddc8eb7ea5bbbefd1e06691590eb60e7f7613cc610dcfadcd0bdd5cc8eb689b36fc721b02f5567674966381ed3758adace9fe00379208187"
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
