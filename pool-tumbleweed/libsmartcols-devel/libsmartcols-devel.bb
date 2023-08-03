SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols-devel-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "27dbb217c16ae3171fc2ceb2a700c558a769c342431fb3707f1b28da3f4266e23682674a09b31fe2593388cb8e77f83c8fc7753b0eba9852f4bba1f73cfa82ba"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm
