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

RPROVIDES:${PN} += "gimp-2.0-scanner-plugin \
xsane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libsane.so.1 \
libtiff.so.6 \
libz.so.1 \
sane-backends \
xdg-utils"

inherit rpm
