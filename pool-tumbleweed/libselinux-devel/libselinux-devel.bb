SUMMARY = "Development files for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-3.5-4.1.aarch64.rpm"
RPM_HASH = "a3e30cbbb5abf9af688c6c25cafe2fc8a1cd36c9da118081e5dc73983445704df9ec215ea7f73f8cd1497083e9a478d7be547caebf2c1a66f89a3399ab9e7d5c"

RPROVIDES:${PN} += "libselinux-devel \
pkgconfig-libselinux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libselinux1 \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
