SUMMARY = "Support for appstreamcli compose"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support to appstreamcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-compose-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "4083a64d2443c20f0c71602a76ca4cbb0f65d5964a92e8ed88127fefb01dd3097b91eba003058aa5c5d09cb47c79596360e9d74f298f81256fcb97620fe48bf2"

RPROVIDES:${PN} += "AppStream-compose AppStream-compose(aarch-64) metainfo() metainfo(org.freedesktop.appstream.compose.metainfo.xml)"
RDEPENDS:${PN} += "AppStream gdk-pixbuf-loader-rsvg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libappstream-compose.so.0()(64bit) libappstream.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
