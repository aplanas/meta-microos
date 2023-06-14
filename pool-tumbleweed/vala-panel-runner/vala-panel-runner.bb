SUMMARY = "Commands runner for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a simple commands runner for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-runner-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "518abc1c04ef1dc047ac85dc0d1e999a8f860fe7ab8169443c35c56e4e1a02b8ad0b56468cb089dee09797fd349fc248a995d18ef876f13246bc6fdcf3432b51"

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
