SUMMARY = "Firewall Builder"
DESCRIPTION = "Firewall Builder consists of a GUI and set of policy compilers for \
various firewall platforms. It helps users maintain a database of \
objects and allows policy editing using simple drag-and-drop \
operations. The GUI generates a firewall description in the form of an XML \
file, which compilers then interpret and generate platform-specific \
code. Several algorithms are provided for automated network object \
discovery and bulk import of data. The GUI and policy compilers are \
independent of another."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.7"

RPM_NAME = "fwbuilder-5.3.7-7.13.aarch64.rpm"
RPM_HASH = "d4708480fd945bf006ebcd0cbec09433942ffbbd87a2569ca523353a57b8e7319b4342321eaee07b070eca7032e003ae78fccea3d6adbf069184340d78d2aa38"

RPROVIDES:${PN} += "application() \
application(fwbuilder.desktop) \
fwbuilder \
fwbuilder(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnetsnmp.so.40()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libz.so.1()(64bit) \
rcs \
update-desktop-files"

inherit rpm
