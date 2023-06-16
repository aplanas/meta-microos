SUMMARY = "Development files for GTK2-backed wxWidgets 3.0"
DESCRIPTION = "wxWidgets is a C++ library for cross-platform GUI development. \
With wxWidgets, you can create applications for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source code. \
 \
This package contains all files needed for developing with wxGTK2. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_0/README.SUSE to pick a correct variant."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-devel-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "e359f3a3260c919a78edd6a67c525e9bce20a12d2dcf03c5716cf5e365456e71199bf9eee34da726b30189e306cb96c67fd748d546e73f3f89f07ad7c7430373"

RPROVIDES:${PN} += "wxGTK-devel \
wxGTK2-devel \
wxWidgets-3-0-devel \
wxWidgets-any-devel \
wxWidgets-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-net-suse3-0-5 \
libwx-baseu-suse.so.3.0.5 \
libwx-baseu-suse3-0-5 \
libwx-baseu-xml-suse.so.3.0.5 \
libwx-baseu-xml-suse3-0-5 \
libwx-gtk2u-adv-suse3-0-5 \
libwx-gtk2u-aui-suse3-0-5 \
libwx-gtk2u-core-suse3-0-5 \
libwx-gtk2u-gl-suse3-0-5 \
libwx-gtk2u-html-suse3-0-5 \
libwx-gtk2u-media-suse3-0-5 \
libwx-gtk2u-propgrid-suse3-0-5 \
libwx-gtk2u-qa-suse3-0-5 \
libwx-gtk2u-ribbon-suse3-0-5 \
libwx-gtk2u-richtext-suse3-0-5 \
libwx-gtk2u-stc-suse3-0-5 \
libwx-gtk2u-xrc-suse3-0-5 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
