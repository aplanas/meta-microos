SUMMARY = "CAD program for creating virtual LEGO models"
DESCRIPTION = "CAD program for creating virtual LEGO models. \
It has an intuitive interface, designed to allow \
new users to start creating new models without \
having to spend too much time learning the \
application."
LICENSE = "GPL-2.0-only"

PV = "23.03"

RPM_NAME = "leocad-23.03-1.1.aarch64.rpm"
RPM_HASH = "47f021588e188a662c5a0b6c0a9dd471bcfdb3f9d1fed28797b7df4e80a54eb5d75069c140814222545d5d14d3d360226e336f4658fbd2e601cca5da15aee7bd"

RPROVIDES:${PN} += "leocad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
povray"

inherit rpm
