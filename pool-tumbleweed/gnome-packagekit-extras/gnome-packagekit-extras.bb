SUMMARY = "Extra applications for the PackageKit API"
DESCRIPTION = "GNOME PackageKit provides session applications for the PackageKit API. \
There are several utilities designed for installing, updating and \
removing packages on your system. \
 \
This package contains tools that provide functionality also provided by \
YaST Software Management."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-extras-43.0-1.3.aarch64.rpm"
RPM_HASH = "f97017eb7f1e3cacf04f52c87604ec4f46907229d700c0bde55c97431692b7afaac0607fcd53a0c220176cb18dfccd0d6f7155d9a6bc7ff95fa46368353410f5"

RPROVIDES:${PN} += "application() \
application(gpk-log.desktop) \
application(org.gnome.Packages.desktop) \
gnome-packagekit-extras \
gnome-packagekit-extras(aarch-64) \
metainfo() \
metainfo(org.gnome.Packages.metainfo.xml)"

RDEPENDS:${PN} += "gnome-packagekit \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit)"

inherit rpm
