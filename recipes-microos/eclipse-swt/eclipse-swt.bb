SUMMARY = "SWT Library for GTK+"
DESCRIPTION = " \
SWT Library for GTK+."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-swt-4.15-9.3.aarch64.rpm"
RPM_HASH = "ad014bfadd7989f2354faa6f30d9db7efc92646ceccd0266e3d043ee4514529ccaec256ec843e713322dfd2903ee0b7a84b862964be377f45d2d5a32239aae02"

RPROVIDES:${PN} += "eclipse-swt eclipse-swt(aarch-64) libswt-atk-gtk-4932r18.so()(64bit) libswt-awt-gtk-4932r18.so()(64bit) libswt-cairo-gtk-4932r18.so()(64bit) libswt-glx-gtk-4932r18.so()(64bit) libswt-gtk-4932r18.so()(64bit) libswt-pi3-gtk-4932r18.so()(64bit) libswt-webkit-gtk-4932r18.so()(64bit) libswt-webkit2extension-gtk-4932r18.so()(64bit) mvn(org.eclipse.swt:org.eclipse.swt) mvn(org.eclipse.swt:swt) osgi(org.eclipse.swt) osgi(org.eclipse.swt.gtk.linux.aarch64)"
RDEPENDS:${PN} += "gtk3 java-headless javapackages-filesystem javapackages-tools libGL.so.1()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjavascriptcoregtk-4.0.so.18()(64bit) libjawt.so()(64bit) libwebkit2gtk-4.0.so.37()(64bit) libwebkit2gtk-4_0-37"

inherit rpm
