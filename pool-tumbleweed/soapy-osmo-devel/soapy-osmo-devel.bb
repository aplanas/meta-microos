SUMMARY = "Development files for the SoapyOsmoSDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapyOsmoSDR."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "soapy-osmo-devel-0.2.5-8.12.aarch64.rpm"
RPM_HASH = "0b42bee1ae183b13776ea560cd846adcd0a212b2340f4f294593721599b91113fc18385ce775055820c2f2e4fab7469a854632e3d5fe20e61ef347e0d4f04ecb"

RPROVIDES:${PN} += "soapy-osmo-devel"

RDEPENDS:${PN} += "libSoapyOsmoSDR0"

inherit rpm
