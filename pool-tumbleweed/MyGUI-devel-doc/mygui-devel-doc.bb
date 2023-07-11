SUMMARY = "Development documentation for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains the development documentation for MyGUI."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "MyGUI-devel-doc-3.4.1-2.2.noarch.rpm"
RPM_HASH = "63323cfa9c28e2a080be5abfcc7efef08bc318d4e1c139bed98047ff5e22699f985724f220d1f2950ff03c3561df022de692e418c9baaa2bb1361085879fd70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MyGUI-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
