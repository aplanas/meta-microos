SUMMARY = "Development files for the soci empty back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-empty-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "67f7cef91c0f00698ce57bb1a73553567280b2d7ebca2c972abe1335b26846b0d46d685d2617284ccc6627a87b0b1fda63aacaf2cf46f9de89452a7c3767b32a"

RPROVIDES:${PN} += "soci-empty-devel"

RDEPENDS:${PN} += "libsoci-empty4-0 \
soci-devel"

inherit rpm
