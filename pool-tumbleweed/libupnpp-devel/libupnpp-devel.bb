SUMMARY = "Development files for libupnpp"
DESCRIPTION = "The libupnpp-devel package contains libraries and header files for \
developing applications that use libupnpp."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.2"

RPM_NAME = "libupnpp-devel-0.22.2-1.3.aarch64.rpm"
RPM_HASH = "5f23f21c461790411feca0a6cac70a37d2703db6cda535c06004b5c72dbfc356f93338cafa30afaac06ac5701b17ff592aba846eea245a4bce1cd8dede46db1a"

RPROVIDES:${PN} += "libupnpp-devel \
pkgconfig-libupnpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupnpp12 \
pkgconfig-libcurl"

inherit rpm
