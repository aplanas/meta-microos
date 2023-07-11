SUMMARY = "Development files for libimobiledevice-glue"
DESCRIPTION = "The libimobiledevice-glue-devel package contains libraries and header files for \
developing applications that use libimobiledevice-glue."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0+git3.20230513"

RPM_NAME = "libimobiledevice-glue-devel-1.0.0+git3.20230513-1.1.aarch64.rpm"
RPM_HASH = "dc4d907b7e5a289410700521952c79dc0e06349e9f6eb85bc8a717989344fb137f729ee6cc9f3af61091ac7910f4262d07b93318fab8dd2b476c40de8ca38aa4"

RPROVIDES:${PN} += "libimobiledevice-glue-devel \
pkgconfig-libimobiledevice-glue-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-glue-1-0-0 \
pkgconfig-libplist-2.0"

inherit rpm
