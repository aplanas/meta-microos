SUMMARY = "Application Development Library for Xfce"
DESCRIPTION = "Exo is an extension library to Xfce which is targeted at application \
development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.0"

RPM_NAME = "libexo-2-0-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "f123cf8d4d5870107590eea248c96ade9733635ec10d7475c24063e7391a81d7e794efb4276cf04a210d67af3728de5e87983a614e36297828d3c522bfce95ce"

RPROVIDES:${PN} += "libexo-2-0 \
libexo-2-0(aarch-64) \
libexo-2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-data \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
perl-URI"

inherit rpm
