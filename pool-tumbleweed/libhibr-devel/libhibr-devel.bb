SUMMARY = "Development files for libhibr"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhibr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-devel-20210421-3.6.aarch64.rpm"
RPM_HASH = "30e183b4334689cd3f81024de74b8d2a137e84e94d14e0d199c7e49cb2255afab6d4e1b1b2b6f102e62f387047e23a5bc1f81973ca0d16147109746ccca508f9"

RPROVIDES:${PN} += "libhibr-devel \
pkgconfig-libhibr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libhibr1"

inherit rpm
