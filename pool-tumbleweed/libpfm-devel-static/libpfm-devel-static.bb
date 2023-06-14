SUMMARY = "Static library version of libpfm"
DESCRIPTION = "This package contains the static variant of libpfm."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-static-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "0b03ef1d172b8454f1b01ee4766ed2a800cea76b934175088a8460f122bd757c9b9441ce5d52c385d8f650d95cf13b60c60481ae92da3de99e40ff2d0fcdb166"

RPROVIDES:${PN} += "libpfm-devel-static"

RDEPENDS:${PN} += "libpfm-devel"

inherit rpm
