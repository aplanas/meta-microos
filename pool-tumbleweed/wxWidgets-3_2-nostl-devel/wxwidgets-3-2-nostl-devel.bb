SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2-nostl. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2-nostl/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-nostl-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "349711a52338dfec31624d09ab1699033d2f2c1377c07e1c28ed69f1666c6e827321e0a18b8ed1ecbe85fdd2ea05c3b7ed064ff8af115615cac8f29c90ded85c"

RPROVIDES:${PN} += "wxWidgets-3-2-nostl-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-nostl-devel \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-baseu-xml-suse-nostl.so.9.0.0 \
libwx-gtk3u-adv-suse-nostl9-0-0 \
libwx-gtk3u-aui-suse-nostl9-0-0 \
libwx-gtk3u-core-suse-nostl9-0-0 \
libwx-gtk3u-gl-suse-nostl9-0-0 \
libwx-gtk3u-html-suse-nostl9-0-0 \
libwx-gtk3u-media-suse-nostl9-0-0 \
libwx-gtk3u-propgrid-suse-nostl9-0-0 \
libwx-gtk3u-qa-suse-nostl9-0-0 \
libwx-gtk3u-ribbon-suse-nostl9-0-0 \
libwx-gtk3u-richtext-suse-nostl9-0-0 \
libwx-gtk3u-stc-suse-nostl9-0-0 \
libwx-gtk3u-xrc-suse-nostl9-0-0 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0"

inherit rpm
