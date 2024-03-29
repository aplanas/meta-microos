SUMMARY = "Development files for libcom_err"
DESCRIPTION = "Development files for the com_err error message display library."
LICENSE = "MIT"

PV = "1.47.0"

RPM_NAME = "libcom_err-devel-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "8ab481197a73695446d8e9ee30076202f0f79954dc00e3bae875953bd538a894fa8759e4f5d450e74850002f4fccdeee75922ca30d594d12af0a9da62a4f85b9"

RPROVIDES:${PN} += "libcom-err-devel \
pkgconfig-com-err \
pkgconfig-ss"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcom-err2 \
pkgconfig-com-err"

inherit rpm
