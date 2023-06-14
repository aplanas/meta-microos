SUMMARY = "Development Environment for the kyotocabinet Library"
DESCRIPTION = "This package contains the development environment (headers, shared \
library symlink, pkg-config file, ...) for libkyotocabinet16"
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.77"

RPM_NAME = "libkyotocabinet-devel-1.2.77-3.1.aarch64.rpm"
RPM_HASH = "2c6c17ac75d28a35bf665db9ef89cf8616fd32a8cfa8d0f24f2e838e2f87e8b3ad586b5a32d5b5df1b44380955a0e7c37f1fad1154a61a9e976f326379adadf8"

RPROVIDES:${PN} += "libkyotocabinet-devel \
libkyotocabinet16-devel \
pkgconfig-kyotocabinet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkyotocabinet16"

inherit rpm
