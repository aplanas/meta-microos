SUMMARY = "Development files for rav1e"
DESCRIPTION = "The rav1e-devel package contains libraries and header files for \
developing applications that use rav1e."
LICENSE = "BSD-2-Clause"

PV = "0.6.4+0"

RPM_NAME = "rav1e-devel-0.6.4+0-1.2.aarch64.rpm"
RPM_HASH = "56ee25f202046a5e930dfd550b1e661e7d625027ef8eb6de8318685bc8646c9546d37a21628c8bcebd04203ffbc63d5e8aae7827ec334357c3f9b7cdfcc7f80c"

RPROVIDES:${PN} += "pkgconfig-rav1e \
rav1e-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librav1e0"

inherit rpm
