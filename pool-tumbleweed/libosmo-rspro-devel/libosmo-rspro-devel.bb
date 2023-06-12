SUMMARY = "Headers for Osmocom Remote SIM"
DESCRIPTION = "libosmo-rsrpo is an utility library for encoding/decoding the ASN.1 BER \
based RSPRO (Remote SIM Protocol) protocol used between the osmo-remsim \
programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-rspro."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "libosmo-rspro-devel-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "6eb83c7409948f5271db6e890e21323a3e11b092f9068ffa8d2834189f30b8a5563fb572b729baeb1678bca4a7ca11f8f592e6dbd25df1a02198ea540ec6dc0b"

RPROVIDES:${PN} += "libosmo-rspro-devel \
libosmo-rspro-devel(aarch-64) \
pkgconfig(libosmo-rspro)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-rspro1"

inherit rpm
