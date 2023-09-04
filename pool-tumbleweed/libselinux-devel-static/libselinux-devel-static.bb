SUMMARY = "Static archives for the SELinux runtime"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the static development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-static-3.5-4.1.aarch64.rpm"
RPM_HASH = "3f9ab7c1938e490e0bdeec66d94b0f4d2d5b8c061c650731b1393416022393f54c3637dbf2524801a42078276fa95c77a7c4c718ac776546d29b37ae95a3e3cc"

RPROVIDES:${PN} += "libselinux-devel-static"

RDEPENDS:${PN} += "libselinux-devel \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
