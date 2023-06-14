SUMMARY = "Development files of libvterm"
DESCRIPTION = "This package contains the development files of libvterm."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libvterm-devel-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "8d32c7a52fa133ff80ce7af46264ef1403e8f5a160aaf7d73abda8d4f4084bdaa6ef9a035b5b52166337bf3bb02bef7b97179277ea9f4d9bb461d6e9b3c41954"

RPROVIDES:${PN} += "libvterm-devel \
pkgconfig-vterm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvterm0"

inherit rpm
