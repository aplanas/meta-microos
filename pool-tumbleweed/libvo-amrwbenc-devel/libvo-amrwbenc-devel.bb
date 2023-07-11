SUMMARY = "Development files for vo-amrwbenc"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use vo-amrwbenc."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc-devel-0.1.3+5-1.2.aarch64.rpm"
RPM_HASH = "90ecf23e9ce80164ae09f026962c5b9c47c478325d12f4da755fbb8898ac1798566db5651e35aa787de0e89b2cead246c612850cd05fcbb18ab66fb6438ccf96"

RPROVIDES:${PN} += "libvo-amrwbenc-devel \
pkgconfig-vo-amrwbenc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvo-amrwbenc0"

inherit rpm
