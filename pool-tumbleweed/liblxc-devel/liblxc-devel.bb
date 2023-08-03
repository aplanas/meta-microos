SUMMARY = "LXC container runtime library development files"
DESCRIPTION = "This package provides the LXC container runtime library development files."
LICENSE = "LGPL-2.1-only"

PV = "5.0.3"

RPM_NAME = "liblxc-devel-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "eaa0fe4cf61cb61ea960ad79c7ff0e956baa1a06b468a01fb3d28a93d3bf8f7616b060a9237b606853b214c47f66f6fee817d2c20ff417ce74f9a9ebadda9fce"

RPROVIDES:${PN} += "liblxc-devel \
pkgconfig-lxc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxc1 \
pkgconfig-libcap \
pkgconfig-libseccomp \
pkgconfig-libselinux"

inherit rpm
