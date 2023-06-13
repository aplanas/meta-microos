SUMMARY = "A GTK-Based Graphical Scanning Front-End for SANE"
DESCRIPTION = "XSane does not support any scanners itself. XSane uses the SANE library \
to talk to scanners that are supported by SANE. \
 \
XSane is designed for acquiring images with scanners (there are other \
devices like cameras and video devices supported by SANE, but XSane is \
not designed for that purpose). You can scan to file, make a photocopy, \
create a fax, and start XSane from the GIMP as a GIMP plug-in. \
 \
XSane may not work correctly or you may not be able to take full \
advantage of all functions if you do not configure XSane correctly. See \
the documentation at /usr/share/sane/xsane/doc/sane-xsane-doc.html. \
 \
The XSane home page is http://www.xsane.org/."
LICENSE = "GPL-2.0+"

PV = "0.999"

RPM_NAME = "xsane-0.999-4.1.aarch64.rpm"
RPM_HASH = "d668cfc37a9de3e294aed2b98c40c32cf2952ef48c92216b0eedd8fec1e488d277e2f76033759b30476c34ebf26d900e6490dd6614a685d493807bd1d09bb08d"

RPROVIDES:${PN} += "application() \
application(xsane.desktop) \
gimp-2.0-scanner-plugin \
xsane \
xsane(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpbase-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsane.so.1()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit) \
sane-backends \
xdg-utils"

inherit rpm
