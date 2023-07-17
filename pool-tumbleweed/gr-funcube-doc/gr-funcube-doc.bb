SUMMARY = "Documentation for gr-funcube"
DESCRIPTION = "Documentation for gr-funcube module for GNU Radio."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-doc-3.10.0.rc3-1.3.noarch.rpm"
RPM_HASH = "63939f8533ef2342381c48eda86b122f4f9a5aca5976a500d678f95f292f9fa6f0ba67802961c4e8dc0715ed221108a2d336e144540cee4572b26651db0bc89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-funcube-doc"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
