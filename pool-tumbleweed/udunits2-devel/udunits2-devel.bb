SUMMARY = "Headers and development libraries for udunits2"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits2-devel-2.2.28-1.8.aarch64.rpm"
RPM_HASH = "d4803b044bae4dda04cd65aaf30a8f126b980bb859b37dedc213ceeff163eb2f926cca9652e689dad8ca57da6e893b7a8eef5c9c74d1dc8df70fe024fbcd1b1b"

RPROVIDES:${PN} += "udunits2-devel \
udunits2-devel(aarch-64)"

RDEPENDS:${PN} += "udunits2"

inherit rpm
