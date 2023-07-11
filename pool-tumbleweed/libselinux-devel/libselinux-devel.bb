SUMMARY = "Development files for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-3.5-3.2.aarch64.rpm"
RPM_HASH = "86327c11e6e58008a76a1ac01044f0577e68de9d3329956ba30a27656a384ef2e5db6139aa2e6341ba9fa3ecfae237be99b3bad089332518d3c8475b6ae797a5"

RPROVIDES:${PN} += "libselinux-devel \
pkgconfig-libselinux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libselinux1 \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
