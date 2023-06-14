SUMMARY = "Header files for the Audio/Video Transport Protocol support library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libavtp."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libavtp-devel-0.2.0-2.1.aarch64.rpm"
RPM_HASH = "c1d155ae1168203be171b7836d57dba09e63e7cf1d9a33a49671f610efc7e7d7bbc37e8d6a2507a7006c8ea45b9f684ec3e75317c58f19cb4834ad44beff2a02"

RPROVIDES:${PN} += "libavtp-devel \
pkgconfig-avtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavtp0"

inherit rpm
