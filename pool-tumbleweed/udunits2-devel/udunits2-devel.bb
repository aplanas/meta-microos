SUMMARY = "Headers and development libraries for udunits2"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits2-devel-2.2.28-1.9.aarch64.rpm"
RPM_HASH = "a6a24ea70b74e5cfd316946a0103debe51ae1ecbf056ec0269845f4630464154eccb309896cc2bca043eeda70ab5bddf2ed13d12ea61535ee1a1cab2bf6c7ce9"

RPROVIDES:${PN} += "udunits2-devel"

RDEPENDS:${PN} += "udunits2"

inherit rpm
