SUMMARY = "The GNU Image Manipulation Program -- ASCII-Art output plugin"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-plugin-aa-2.10.34-5.1.aarch64.rpm"
RPM_HASH = "2f18ca2a725f8cf7d07cb70c0e3ce37d8e40eebc6aaea7fc883aa5ad3bf1483a4c87f1f49e22bacd7f159fd468eb4fe68e9c3fb079a6a148702cb6172a9d97fe"

RPROVIDES:${PN} += "gimp-plugin-aa"

RDEPENDS:${PN} += "gimp \
ld-linux-aarch64.so.1 \
libaa.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
