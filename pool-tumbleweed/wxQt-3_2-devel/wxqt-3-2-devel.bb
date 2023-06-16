SUMMARY = "Development files for wxQt-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxQt-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxQt-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxQt-3_2-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "10ce7b9e6089d75e9d93fd714995ee324e959361d446db3c1907375745f03328e6222764326b5da1ac5fad5e94ccd142040c97f54a4e7afdb23e43e133592f1e"

RPROVIDES:${PN} += "wxQt-3-2-devel \
wxQt-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-devel \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-qtu-adv-suse9-0-0 \
libwx-qtu-aui-suse9-0-0 \
libwx-qtu-core-suse9-0-0 \
libwx-qtu-gl-suse9-0-0 \
libwx-qtu-html-suse9-0-0 \
libwx-qtu-media-suse9-0-0 \
libwx-qtu-propgrid-suse9-0-0 \
libwx-qtu-qa-suse9-0-0 \
libwx-qtu-ribbon-suse9-0-0 \
libwx-qtu-richtext-suse9-0-0 \
libwx-qtu-stc-suse9-0-0 \
libwx-qtu-xrc-suse9-0-0 \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5Widgets \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
