SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxGTK3-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxGTK3-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxGTK3-3_2-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "b71f64aa4b7a54795b027ee7addfadca0f86fc69679067de8d2ceae6d4f664e58babbcc837a2089d43dda78bbfd81fb1faa32cdde73d2c6c25ea7027a2f14d23"

RPROVIDES:${PN} += "wxGTK3-3-2-devel \
wxGTK3-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-devel \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-adv-suse9-0-0 \
libwx-gtk3u-aui-suse9-0-0 \
libwx-gtk3u-core-suse9-0-0 \
libwx-gtk3u-gl-suse9-0-0 \
libwx-gtk3u-html-suse9-0-0 \
libwx-gtk3u-media-suse9-0-0 \
libwx-gtk3u-propgrid-suse9-0-0 \
libwx-gtk3u-qa-suse9-0-0 \
libwx-gtk3u-ribbon-suse9-0-0 \
libwx-gtk3u-richtext-suse9-0-0 \
libwx-gtk3u-stc-suse9-0-0 \
libwx-gtk3u-webview-suse9-0-0 \
libwx-gtk3u-xrc-suse9-0-0 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0"

inherit rpm
