SUMMARY = "The GNU Image Manipulation Program -- ASCII-Art output plugin"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-plugin-aa-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "0bef46ae201bf0c1883833661e7e35460ba8a7445ab35caf1ecb1880a5cbb718cede9f2067b30890c25f7ea42c98de3977c7c61078e0cfd93e41907a62ac26ff"

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
