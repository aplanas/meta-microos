SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-private-devel-6.5.1-1.3.noarch.rpm"
RPM_HASH = "d1fbc82a0af80d03c5f587879f4245ede39abb145c54290e86e1d7e621633c385e992b077382ebc68f18e4926f3bcfde5b357ff683cef839a43a43d603187778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-private-devel"

RDEPENDS:${PN} += "qt6-qml-private-devel \
qt6-qmlcore-private-devel \
qt6-qmllocalstorage-private-devel \
qt6-qmlmodels-private-devel \
qt6-qmlworkerscript-private-devel \
qt6-quick-private-devel \
qt6-quickcontrols2-private-devel \
qt6-quickcontrols2impl-private-devel \
qt6-quickdialogs2-private-devel \
qt6-quickdialogs2quickimpl-private-devel \
qt6-quickdialogs2utils-private-devel \
qt6-quicklayouts-private-devel \
qt6-quickparticles-private-devel \
qt6-quickshapes-private-devel \
qt6-quicktemplates2-private-devel \
qt6-quicktest-private-devel \
qt6-quickwidgets-private-devel"

inherit rpm
