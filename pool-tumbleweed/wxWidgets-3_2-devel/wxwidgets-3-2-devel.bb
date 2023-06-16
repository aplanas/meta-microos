SUMMARY = "Development files for wxWidgets-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "80d070b1e46dd26b6dd0d3b639d8033c6478c2ef270776256359649692b012651fdfedf59d90df545fc86d2294cf24da03b2be06c527d29c13fa4c47af19685c"

RPROVIDES:${PN} += "wxGTK-devel \
wxGTK2-devel \
wxWidgets-3-2-devel \
wxWidgets-any-devel \
wxWidgets-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-devel \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk2u-adv-suse9-0-0 \
libwx-gtk2u-aui-suse9-0-0 \
libwx-gtk2u-core-suse9-0-0 \
libwx-gtk2u-gl-suse9-0-0 \
libwx-gtk2u-html-suse9-0-0 \
libwx-gtk2u-media-suse9-0-0 \
libwx-gtk2u-propgrid-suse9-0-0 \
libwx-gtk2u-qa-suse9-0-0 \
libwx-gtk2u-ribbon-suse9-0-0 \
libwx-gtk2u-richtext-suse9-0-0 \
libwx-gtk2u-stc-suse9-0-0 \
libwx-gtk2u-xrc-suse9-0-0 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
