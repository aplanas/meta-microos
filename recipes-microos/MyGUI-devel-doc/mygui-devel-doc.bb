SUMMARY = "Development documentation for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains the development documentation for MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-devel-doc-3.4.1-2.1.noarch.rpm"
RPM_HASH = "2302068070edda82341566858abad99923b3f3d2ac8790e1769753fa5514e21afb4de1b95a575465af9abbc063241d24a99adc86db20dc689fc2a572f67b8b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MyGUI-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
