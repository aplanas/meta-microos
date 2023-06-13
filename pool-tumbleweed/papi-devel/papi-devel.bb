SUMMARY = "Software Development Kit for PAPI"
DESCRIPTION = "This package includes the C header files that specify the PAPI userspace \
libraries and interfaces. This is required for rebuilding any program \
that uses PAPI."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-devel-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "18be12175547ffbee34390c6dede2a3f666b2d682ba6b404fcc0b5931baa201b8d0456a4abd78471156df04c544481eb2849c9d59ad709a7087b97134e73d948"

RPROVIDES:${PN} += "papi-devel \
papi-devel(aarch-64) \
pkgconfig(papi) \
pkgconfig(papi-7.0) \
pkgconfig(papi-7.0.0.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpapi \
linux-kernel-headers \
papi"

inherit rpm
