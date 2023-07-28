SUMMARY = "Development files for libzimg2"
DESCRIPTION = "The libzimg-devel package contains libraries and header files for \
developing applications that use libzimg2."
LICENSE = "WTFPL"

PV = "3.0.5"

RPM_NAME = "zimg-devel-3.0.5-1.1.aarch64.rpm"
RPM_HASH = "41157a51dc9d9c2ffeaeaa4fb5a95bfa2c70fe2397cf1097e27ca351b5d64de5b0d75fb2e78ccfa8bd9b7397bf6b93cdfc52defde78b9e92d5f58a585ad7e9d0"

RPROVIDES:${PN} += "pkgconfig-zimg \
zimg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzimg2"

inherit rpm
