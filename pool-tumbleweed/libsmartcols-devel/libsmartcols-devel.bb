SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-2.39-3.1.aarch64.rpm"
RPM_HASH = "5390a581fb9b290fd8cd0b26f526ad777fb827c8ec2c29637b0bf3f8b3f49a6ab210f340aae13da714f60b547be2e58ff94e36dd6f851ba219b8fbedc4abfb62"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm
