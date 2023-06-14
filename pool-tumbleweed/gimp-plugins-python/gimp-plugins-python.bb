SUMMARY = "The GNU Image Manipulation Program - python-gtk based plugins"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-plugins-python-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "f0c69e072b6d8f9e99b572ebfb73ce8b371d97a782ecfc25604652feb0b397a65c15e49427d2d995ecda3574c6088694f71fbff706fac2e2f2f1021bcdb72e87"

RPROVIDES:${PN} += "gimp-/usr/lib64/gimp/2.0/plug-ins/pyconsole.py \
gimp-2.0-plugins-python \
gimp-plugins-python"

RDEPENDS:${PN} += "/usr/bin/env \
gimp \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgegl-0.4.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpconfig-2.0.so.0 \
libgimpthumb-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
python-gtk"

inherit rpm
