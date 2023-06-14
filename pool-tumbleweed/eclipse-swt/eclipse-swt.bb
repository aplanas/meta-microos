SUMMARY = "SWT Library for GTK+"
DESCRIPTION = " \
SWT Library for GTK+."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-swt-4.15-9.3.aarch64.rpm"
RPM_HASH = "ad014bfadd7989f2354faa6f30d9db7efc92646ceccd0266e3d043ee4514529ccaec256ec843e713322dfd2903ee0b7a84b862964be377f45d2d5a32239aae02"

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
