SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "liblog4cxx-devel-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "d9dfb699919fc1234f8ca4efe87b98dcb3a6e803cce387526136ad405ff72a8fec3a5252b61f2448ea541dd92ad266e88c58666fe9ef5bdf976018aea91a4a57"

RPROVIDES:${PN} += "cmake-log4cxx \
liblog4cxx-devel \
pkgconfig-liblog4cxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4cxx13 \
pkgconfig-apr-1 \
pkgconfig-apr-util-1"

inherit rpm
