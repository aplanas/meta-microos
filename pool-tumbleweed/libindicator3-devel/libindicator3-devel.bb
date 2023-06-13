SUMMARY = "Development files for the Panel indicator applet"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator3-devel-16.10.0+bzr20171205-4.15.aarch64.rpm"
RPM_HASH = "1e5143e5a748e921bbdba188ae43761dac01f67b62f338c78c400bfa980c8a2c643a7f357c122ab5c2163e071eb1ce9157f01e6fe5cef2592d2f6fdc9234505a"

RPROVIDES:${PN} += "libindicator3-devel \
libindicator3-devel(aarch-64) \
pkgconfig(indicator3-0.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libido3-0.1.so.0()(64bit) \
libindicator3-7 \
libindicator3.so.7()(64bit) \
pkgconfig(gtk+-3.0)"

inherit rpm
