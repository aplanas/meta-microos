SUMMARY = "Development files for vo-amrwbenc"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use vo-amrwbenc."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc-devel-0.1.3+5-1.1.aarch64.rpm"
RPM_HASH = "dd1e37ef211e40ea34a601fec153cb33741c6c56cdd6b6d65f5ae4ef1cda78da7c7be694778b94a76589c09f8a3bd0bf36f12b8dfe4ea3d16090561d1415fd5c"

RPROVIDES:${PN} += "libvo-amrwbenc-devel \
libvo-amrwbenc-devel(aarch-64) \
pkgconfig(vo-amrwbenc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvo-amrwbenc0"

inherit rpm
