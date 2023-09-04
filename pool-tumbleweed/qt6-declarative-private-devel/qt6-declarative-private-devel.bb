SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-private-devel-6.5.2-2.1.noarch.rpm"
RPM_HASH = "2e7499523370c5e1dc8d4fb34982d3c94969b15325bf6cc7d31308acada26044cde232e217cc63afc804f7559d6cdbfaf49565cf98182de1fe0f82c8a1be1a6b"
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
