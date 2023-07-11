SUMMARY = "Development files for libicns"
DESCRIPTION = "Libraries and header files for developing applications that use libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns-devel-0.8.1+git20201014-1.11.aarch64.rpm"
RPM_HASH = "2e8ecbb925bd6c7f37bdcfd5148b8b871de2f82525a5fe822898457ef3e7131b9308a38210c2f44a8933808b42da8a96c716042377449f93a50cade3a084730f"

RPROVIDES:${PN} += "libicns-devel \
pkgconfig-libicns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libicns1"

inherit rpm
