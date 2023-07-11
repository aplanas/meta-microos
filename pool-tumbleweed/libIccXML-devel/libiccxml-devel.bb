SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML-devel-0.9.8-2.27.aarch64.rpm"
RPM_HASH = "c4c1aa4c1455161907fd2357ac4a24f75d06112a05b59ad73752466c88debf0dcc92c65ee1245836b889aec6f6dbb743b003f07ef66292ce406ad4dbeabe7ecc"

RPROVIDES:${PN} += "libIccXML-devel \
pkgconfig-iccxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIccXML2"

inherit rpm
