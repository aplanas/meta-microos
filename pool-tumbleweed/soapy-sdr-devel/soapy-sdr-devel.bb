SUMMARY = "Development files for the SoapySDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapySDR."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "soapy-sdr-devel-0.8.1-1.12.aarch64.rpm"
RPM_HASH = "b00a2217ad4674ec4b207390b97b8af59f87ca7940b45113932fe38bfe40cd3311ee52ddec46d0ed81a0de4607885c42c381bb0d72b4d64f238e4b69a4b51952"

RPROVIDES:${PN} += "cmake-SoapySDR \
pkgconfig-SoapySDR \
soapy-sdr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSoapySDR0-8"

inherit rpm
