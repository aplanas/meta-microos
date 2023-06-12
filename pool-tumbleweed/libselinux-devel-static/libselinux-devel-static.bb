SUMMARY = "Static archives for the SELinux runtime"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the static development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-static-3.5-2.1.aarch64.rpm"
RPM_HASH = "d39baec64a904a5787cd60fe2837fd077f4fd7dd6c14042cf3f01deb12d96a1fd270ddd8116de6adf9dff235135683c1866067e3d13182f37e13d7b2288ab206"

RPROVIDES:${PN} += "libselinux-devel-static \
libselinux-devel-static(aarch-64)"
RDEPENDS:${PN} += "libselinux-devel \
pkgconfig(libpcre2-8) \
pkgconfig(libsepol)"

inherit rpm
