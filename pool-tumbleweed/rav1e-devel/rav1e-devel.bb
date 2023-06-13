SUMMARY = "Development files for rav1e"
DESCRIPTION = "The rav1e-devel package contains libraries and header files for \
developing applications that use rav1e."
LICENSE = "BSD-2-Clause"

PV = "0.6.4+0"

RPM_NAME = "rav1e-devel-0.6.4+0-1.1.aarch64.rpm"
RPM_HASH = "663e1b7c638cd9faebc2f1eb9859875e72c550f804b0e3db257f99d0b74fda27856d6c2b540db5c9160cd79a89f79b7012d6967362b82f5bd02484067f4a0b64"

RPROVIDES:${PN} += "pkgconfig(rav1e) \
rav1e-devel \
rav1e-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librav1e0"

inherit rpm
