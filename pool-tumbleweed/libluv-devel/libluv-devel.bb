SUMMARY = "Header files for lua51-luv"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua51-luv."
LICENSE = "Apache-2.0"

PV = "1.43.0~0"

RPM_NAME = "libluv-devel-1.43.0~0-3.6.aarch64.rpm"
RPM_HASH = "c62fbe6325a4a996edbbc7a6aba77affac4c15df22c5b06bfedd5edb7271c422be84ed115f9ed4daa3ce20369ab5810da764fa4ea0ffebedc8d077c761528d2b"

RPROVIDES:${PN} += "libluv-devel \
pkgconfig-libluv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluv1"

inherit rpm
