SUMMARY = "SWT Library for GTK+"
DESCRIPTION = " \
SWT Library for GTK+."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-swt-4.15-9.4.aarch64.rpm"
RPM_HASH = "a44c2fd5dc88ea76c61309d5056819f5653fb72cd379dc2c2e68d76963a47f4d3cdde23c5f1e3880a614971c68823c339e249a4b105cd43fe6b47816f234bc68"

RPROVIDES:${PN} += "eclipse-swt \
libswt-atk-gtk-4932r18.so \
libswt-awt-gtk-4932r18.so \
libswt-cairo-gtk-4932r18.so \
libswt-glx-gtk-4932r18.so \
libswt-gtk-4932r18.so \
libswt-pi3-gtk-4932r18.so \
libswt-webkit-gtk-4932r18.so \
libswt-webkit2extension-gtk-4932r18.so \
mvn-org.eclipse.swt-org.eclipse.swt \
mvn-org.eclipse.swt-swt \
osgi-org.eclipse.swt \
osgi-org.eclipse.swt.gtk.linux.aarch64"

RDEPENDS:${PN} += "gtk3 \
java-headless \
javapackages-filesystem \
javapackages-tools \
libGL.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libjawt.so \
libwebkit2gtk-4-0-37 \
libwebkit2gtk-4.0.so.37"

inherit rpm
