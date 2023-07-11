SUMMARY = "Development files for the SoapyOsmoSDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapyOsmoSDR."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapy-osmo-devel-0.2.5-8.13.aarch64.rpm"
RPM_HASH = "5678eddbd89bfc1ea4bad7277642134a9d56c7f977821fde94efebe085bd847e5e5d2a12c0b46ae4f3459c3c1b076cb8fe1eb1d617687335343583ead3632c46"

RPROVIDES:${PN} += "soapy-osmo-devel"

RDEPENDS:${PN} += "libSoapyOsmoSDR0"

inherit rpm
