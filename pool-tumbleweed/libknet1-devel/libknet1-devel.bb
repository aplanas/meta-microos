SUMMARY = "Development files fro the Kronosnet core switching implementation"
DESCRIPTION = "The whole kronosnet core is implemented in this library. \
Please refer to the not-yet-existing documentation for further \
information."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-devel-1.21-1.10.aarch64.rpm"
RPM_HASH = "d0c2a9d99d04b42a50cd726bbae8892bc4b7ee637e8cf6a870fff5bfd0c3b3d00996506761381958bef2d689ca49472f482994950666ceefd96ec2f64fc5eac0"

RPROVIDES:${PN} += "libknet1-devel \
libknet1-devel(aarch-64) \
pkgconfig(libknet)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libknet1(aarch-64) \
pkgconfig"

inherit rpm
