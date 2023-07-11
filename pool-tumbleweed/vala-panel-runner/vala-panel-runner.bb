SUMMARY = "Commands runner for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a simple commands runner for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-runner-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "9ccfa850a974c85c7122e3a4d5017333515dfd5341485c6e13bf928bc62f3ce5345337b7a43217608a92a30ffd611f46c5e76bed12d20cad1aa8cf547adc5519"

RPROVIDES:${PN} += "vala-panel-runner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
vala-panel"

inherit rpm
