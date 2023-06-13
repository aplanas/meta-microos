SUMMARY = "FreePascal RAD IDE and Component Library"
DESCRIPTION = "Lazarus is a Rapid Application Development \
tool for the FreePascal compiler using the Lazarus component \
library - LCL. The LCL is included in this package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "f4e086ea0f65840ffb819d36da3296f15b7ffd38063dc221e900bc581f2c6155a0cbd5e128c990491aeac56d0cc99b21cd29ac0309cf35efa0f253ea06886a7d"

RPROVIDES:${PN} += "application() \
application(lazarus.desktop) \
config(lazarus) \
lazarus \
lazarus(aarch-64) \
metainfo() \
metainfo(lazarus.appdata.xml) \
mimehandler(text/lazarus-code-inlay) \
mimehandler(text/lazarus-form) \
mimehandler(text/lazarus-package) \
mimehandler(text/lazarus-package-link) \
mimehandler(text/lazarus-project-information) \
mimehandler(text/lazarus-project-source) \
mimehandler(text/lazarus-resource) \
mimehandler(text/x-pascal)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/instantfpc \
binutils \
desktop-file-utils \
fpc \
fpc-src \
gcc \
gdb \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
make \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-2.0) \
shared-mime-info"

inherit rpm
