SUMMARY = "Development files for an old API variant of wxWidgets"
DESCRIPTION = "wxWidgets is a C++ library for cross-platform GUI development. \
With wxWidgets, you can create applications for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source code. \
 \
This package contains all files needed for developing with wxGTK2. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_0-nostl/README.SUSE to pick a correct variant."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-nostl-devel-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "e0e975fff63eaa836789b4addfa1e0dbfca573241618e35af37a218aed1d3e5390c4f84770eb441d4e6c80355a38cc3b7bd15dde509306eb052772bf3c5c11fc"

RPROVIDES:${PN} += "wxWidgets-3-0-nostl-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-net-suse-nostl3-0-5 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-suse-nostl3-0-5 \
libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl3-0-5 \
libwx-gtk2u-adv-suse-nostl3-0-5 \
libwx-gtk2u-aui-suse-nostl3-0-5 \
libwx-gtk2u-core-suse-nostl3-0-5 \
libwx-gtk2u-gl-suse-nostl3-0-5 \
libwx-gtk2u-html-suse-nostl3-0-5 \
libwx-gtk2u-media-suse-nostl3-0-5 \
libwx-gtk2u-propgrid-suse-nostl3-0-5 \
libwx-gtk2u-qa-suse-nostl3-0-5 \
libwx-gtk2u-ribbon-suse-nostl3-0-5 \
libwx-gtk2u-richtext-suse-nostl3-0-5 \
libwx-gtk2u-stc-suse-nostl3-0-5 \
libwx-gtk2u-xrc-suse-nostl3-0-5 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
