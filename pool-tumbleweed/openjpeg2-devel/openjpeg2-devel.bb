SUMMARY = "Development files for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the development files for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-devel-2.5.0-3.4.aarch64.rpm"
RPM_HASH = "212365507510766485831bd55f22186f6e0e4859b239418f77bea25ada66cb0ebc4a5905d79682e705f1556870be754d9661332e72016ac4916620ba479a3730"

RPROVIDES:${PN} += "openjpeg2-devel \
pkgconfig-libopenjp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenjp2-7 \
openjpeg2"

inherit rpm
