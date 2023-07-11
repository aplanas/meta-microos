SUMMARY = "Header files and documentation for libsnapper"
DESCRIPTION = "This package contains header files and documentation for developing with \
libsnapper."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "libsnapper-devel-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "4d2766ca9c527c16b358977d520cdabd559492d6f1788478b47538bcf3ccf8eecc832b60700d2e76c432d326c8e5d33238717e038bfd190fa5f9ed16adc0002e"

RPROVIDES:${PN} += "libsnapper-devel"

RDEPENDS:${PN} += "gcc-c++ \
libacl-devel \
libboost-headers-devel \
libbtrfs-devel \
libmount-devel \
libsnapper7 \
libstdc++-devel \
libxml2-devel"

inherit rpm
