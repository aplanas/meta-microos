SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-private-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "b477aa21251262614a0a53ef4198e26e36ff385532cdf60a0bba99c26b025b98a3995fc465c8d745ae4a971d11361d6e8f369f71233d3e3c892bfad63a779c31"
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
