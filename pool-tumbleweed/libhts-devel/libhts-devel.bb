SUMMARY = "Header files and libraries for compiling against libhts"
DESCRIPTION = "Header files and libraries of the HTSlib project for compiling against libhts."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libhts-devel-1.16-1.3.aarch64.rpm"
RPM_HASH = "c2a3aad3e1c7ecf9456c83bbdf4e172af7f803ba21ebc892b2cf7c48bfc07ad6bce1abfc919aa575e080d56b8beef6bb94615fff7531c5623107fa717dee6db0"

RPROVIDES:${PN} += "libhts-devel \
libhts-devel(aarch-64) \
pkgconfig(htslib)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libhts3 \
pkgconfig(bzip2) \
pkgconfig(libcurl) \
pkgconfig(liblzma) \
pkgconfig(zlib)"

inherit rpm
