SUMMARY = "XFCE4 multiload-ng package"
DESCRIPTION = "Provides required files for XFCE4 panel integration."
LICENSE = "GPL-2.0+"

PV = "git20210103.743885d"

RPM_NAME = "multiload-ng-xfce4-git20210103.743885d-1.7.aarch64.rpm"
RPM_HASH = "408b2efb1eb2d28abb34dd315c3740f78ee3b0ae290b7c403683bdd1925eb4b0d87cf6894bb9f84dbed1c945c30b5a7f7a1d18ab6c904c7f2375aba559f019c2"

RPROVIDES:${PN} += "libmultiload-ng.so()(64bit) \
multiload-ng-xfce4 \
multiload-ng-xfce4(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4util.so.7()(64bit) \
multiload-ng-base"

inherit rpm
