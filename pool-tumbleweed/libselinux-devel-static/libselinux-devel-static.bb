SUMMARY = "Static archives for the SELinux runtime"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the static development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-static-3.5-3.2.aarch64.rpm"
RPM_HASH = "cd09749448765dcc57abe81cf9906336ca9f37909aff181ab6e6437eb852a31c6d5095f17686b7656eb516ac80dccd76d93681ec4ddc7484f5a3db67b5796fa9"

RPROVIDES:${PN} += "libselinux-devel-static"

RDEPENDS:${PN} += "libselinux-devel \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
