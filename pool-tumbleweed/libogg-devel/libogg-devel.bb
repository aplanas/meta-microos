SUMMARY = "Include Files and Libraries for Ogg Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libogg."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libogg-devel-1.3.5-1.7.aarch64.rpm"
RPM_HASH = "781291d76832fa3f000d0eded5a2d302e2409b28b1adf06c092a589f676d1eed6bbf7fcb6f1da5d1cda373b57b42efffcdc63a15aff22f21f5bf09406c13c4b7"

RPROVIDES:${PN} += "libogg-devel \
libogg-devel(aarch-64) \
pkgconfig(ogg)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libogg0"

inherit rpm
