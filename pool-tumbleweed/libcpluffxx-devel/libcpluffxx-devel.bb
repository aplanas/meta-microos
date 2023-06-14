SUMMARY = "Development files for libcpluffxx"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use libcpluffxx."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluffxx-devel-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "f72e4d0ca6550ab7c6ab56e6f16a069cd5fc485011bc0eae9e36a821087f9cbb78b623ec01b8120530480878cb87461af7439765f53716a47ec159b7ab65d204"

RPROVIDES:${PN} += "libcpluffxx-devel \
pkgconfig-libcpluffxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpluffxx0 \
pkgconfig-libcpluff"

inherit rpm
