SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "libxml++-devel-5.0.3-1.3.aarch64.rpm"
RPM_HASH = "810d37baa1ecefeed24241b8b7ebabadca9123e7290397fb0c0cdc35aa29c3f8fd002fba69ec4417d1c175d7a6c17f4c4225cf4a09576334ee85394f690bb039"

RPROVIDES:${PN} += "libxml++-devel \
pkgconfig-libxml++-5.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-5-0-1 \
pkgconfig-libxml-2.0"

inherit rpm
