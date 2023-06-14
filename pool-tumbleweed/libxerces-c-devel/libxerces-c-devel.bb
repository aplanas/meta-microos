SUMMARY = "A validating XML parser - Development Files"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. \
 \
This package includes files needed for development with Xerces-c"
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxerces-c-devel-3.2.4-1.5.aarch64.rpm"
RPM_HASH = "581690b5918cb02d2420f937f438a3003ad4ef7c4c7f11a8a890050455268cec81af126e2732990835db777a22ff069820b1f205b87b0c1f97bf59da6a18030f"

RPROVIDES:${PN} += "Xerces-c-devel \
libXerces-c-devel \
libxerces-c-devel \
pkgconfig-xerces-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxerces-c-3-2"

inherit rpm
