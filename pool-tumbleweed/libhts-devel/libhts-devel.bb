SUMMARY = "Header files and libraries for compiling against libhts"
DESCRIPTION = "Header files and libraries of the HTSlib project for compiling against libhts."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libhts-devel-1.16-1.4.aarch64.rpm"
RPM_HASH = "5ac32b4e7cc71108fddb6cdcaeca463bc025ec1aaccd161ae769024664f9fe0f38911adfab9f0e965d3a091e689d8cd0d63f087e66f65f30fb3054aa3f87f6b5"

RPROVIDES:${PN} += "libhts-devel \
pkgconfig-htslib"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libhts3 \
pkgconfig-bzip2 \
pkgconfig-libcurl \
pkgconfig-liblzma \
pkgconfig-zlib"

inherit rpm
