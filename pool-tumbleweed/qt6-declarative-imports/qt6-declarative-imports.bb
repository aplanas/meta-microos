SUMMARY = "Qt 6 Declarative QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Declarative module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "431a9d3112a605ecbfee9cbbe370336c139f10893bab634ade5d62152b67d3c98f51861ba2e3762b73d793522bde5384b7477bf69dffefb92b1dd3d82e2aa494"

RPROVIDES:${PN} += "libeffectsplugin.so()(64bit) \
libeffectsplugin.so(Qt_6)(64bit) \
liblabsanimationplugin.so()(64bit) \
liblabsanimationplugin.so(Qt_6)(64bit) \
liblabsmodelsplugin.so()(64bit) \
liblabsmodelsplugin.so(Qt_6)(64bit) \
libmodelsplugin.so()(64bit) \
libmodelsplugin.so(Qt_6)(64bit) \
libparticlesplugin.so()(64bit) \
libparticlesplugin.so(Qt_6)(64bit) \
libqmlfolderlistmodelplugin.so()(64bit) \
libqmlfolderlistmodelplugin.so(Qt_6)(64bit) \
libqmllocalstorageplugin.so()(64bit) \
libqmllocalstorageplugin.so(Qt_6)(64bit) \
libqmlmetaplugin.so()(64bit) \
libqmlmetaplugin.so(Qt_6)(64bit) \
libqmlplugin.so()(64bit) \
libqmlplugin.so(Qt_6)(64bit) \
libqmlsettingsplugin.so()(64bit) \
libqmlsettingsplugin.so(Qt_6)(64bit) \
libqmlshapesplugin.so()(64bit) \
libqmlshapesplugin.so(Qt_6)(64bit) \
libqmlwavefrontmeshplugin.so()(64bit) \
libqmlwavefrontmeshplugin.so(Qt_6)(64bit) \
libqmlxmllistmodelplugin.so()(64bit) \
libqmlxmllistmodelplugin.so(Qt_6)(64bit) \
libqquicklayoutsplugin.so()(64bit) \
libqquicklayoutsplugin.so(Qt_6)(64bit) \
libqtlabsplatformplugin.so()(64bit) \
libqtlabsplatformplugin.so(Qt_6)(64bit) \
libqtqmlcoreplugin.so()(64bit) \
libqtqmlcoreplugin.so(Qt_6)(64bit) \
libqtquick2plugin.so()(64bit) \
libqtquick2plugin.so(Qt_6)(64bit) \
libqtquickcontrols2basicstyleimplplugin.so()(64bit) \
libqtquickcontrols2basicstyleimplplugin.so(Qt_6)(64bit) \
libqtquickcontrols2basicstyleplugin.so()(64bit) \
libqtquickcontrols2basicstyleplugin.so(Qt_6)(64bit) \
libqtquickcontrols2fusionstyleimplplugin.so()(64bit) \
libqtquickcontrols2fusionstyleimplplugin.so(Qt_6)(64bit) \
libqtquickcontrols2fusionstyleplugin.so()(64bit) \
libqtquickcontrols2fusionstyleplugin.so(Qt_6)(64bit) \
libqtquickcontrols2imaginestyleimplplugin.so()(64bit) \
libqtquickcontrols2imaginestyleimplplugin.so(Qt_6)(64bit) \
libqtquickcontrols2imaginestyleplugin.so()(64bit) \
libqtquickcontrols2imaginestyleplugin.so(Qt_6)(64bit) \
libqtquickcontrols2implplugin.so()(64bit) \
libqtquickcontrols2implplugin.so(Qt_6)(64bit) \
libqtquickcontrols2materialstyleimplplugin.so()(64bit) \
libqtquickcontrols2materialstyleimplplugin.so(Qt_6)(64bit) \
libqtquickcontrols2materialstyleplugin.so()(64bit) \
libqtquickcontrols2materialstyleplugin.so(Qt_6)(64bit) \
libqtquickcontrols2nativestyleplugin.so()(64bit) \
libqtquickcontrols2nativestyleplugin.so(Qt_6)(64bit) \
libqtquickcontrols2plugin.so()(64bit) \
libqtquickcontrols2plugin.so(Qt_6)(64bit) \
libqtquickcontrols2universalstyleimplplugin.so()(64bit) \
libqtquickcontrols2universalstyleimplplugin.so(Qt_6)(64bit) \
libqtquickcontrols2universalstyleplugin.so()(64bit) \
libqtquickcontrols2universalstyleplugin.so(Qt_6)(64bit) \
libqtquickdialogs2quickimplplugin.so()(64bit) \
libqtquickdialogs2quickimplplugin.so(Qt_6)(64bit) \
libqtquickdialogsplugin.so()(64bit) \
libqtquickdialogsplugin.so(Qt_6)(64bit) \
libqtquicktemplates2plugin.so()(64bit) \
libqtquicktemplates2plugin.so(Qt_6)(64bit) \
libquickcontrolstestutilsprivateplugin.so()(64bit) \
libquickcontrolstestutilsprivateplugin.so(Qt_6)(64bit) \
libquicktestplugin.so()(64bit) \
libquicktestplugin.so(Qt_6)(64bit) \
libquicktoolingplugin.so()(64bit) \
libquicktoolingplugin.so(Qt_6)(64bit) \
libquickwindowplugin.so()(64bit) \
libquickwindowplugin.so(Qt_6)(64bit) \
libsharedimageplugin.so()(64bit) \
libsharedimageplugin.so(Qt_6)(64bit) \
libworkerscriptplugin.so()(64bit) \
libworkerscriptplugin.so(Qt_6)(64bit) \
qt6-declarative-imports \
qt6-declarative-imports(aarch-64) \
qt6-quickcontrols2-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6LabsAnimation.so.6()(64bit) \
libQt6LabsAnimation.so.6(Qt_6)(64bit) \
libQt6LabsFolderListModel.so.6()(64bit) \
libQt6LabsFolderListModel.so.6(Qt_6)(64bit) \
libQt6LabsQmlModels.so.6()(64bit) \
libQt6LabsQmlModels.so.6(Qt_6)(64bit) \
libQt6LabsSettings.so.6()(64bit) \
libQt6LabsSettings.so.6(Qt_6)(64bit) \
libQt6LabsSharedImage.so.6()(64bit) \
libQt6LabsSharedImage.so.6(Qt_6)(64bit) \
libQt6LabsWavefrontMesh.so.6()(64bit) \
libQt6LabsWavefrontMesh.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6QmlCore.so.6()(64bit) \
libQt6QmlCore.so.6(Qt_6)(64bit) \
libQt6QmlLocalStorage.so.6()(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6)(64bit) \
libQt6QmlModels.so.6()(64bit) \
libQt6QmlModels.so.6(Qt_6)(64bit) \
libQt6QmlWorkerScript.so.6()(64bit) \
libQt6QmlWorkerScript.so.6(Qt_6)(64bit) \
libQt6QmlXmlListModel.so.6()(64bit) \
libQt6QmlXmlListModel.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickControls2.so.6()(64bit) \
libQt6QuickControls2.so.6(Qt_6)(64bit) \
libQt6QuickControls2Impl.so.6()(64bit) \
libQt6QuickControls2Impl.so.6(Qt_6)(64bit) \
libQt6QuickDialogs2.so.6()(64bit) \
libQt6QuickDialogs2.so.6(Qt_6)(64bit) \
libQt6QuickDialogs2QuickImpl.so.6()(64bit) \
libQt6QuickDialogs2QuickImpl.so.6(Qt_6)(64bit) \
libQt6QuickEffects.so.6()(64bit) \
libQt6QuickEffects.so.6(Qt_6)(64bit) \
libQt6QuickLayouts.so.6()(64bit) \
libQt6QuickLayouts.so.6(Qt_6)(64bit) \
libQt6QuickParticles.so.6()(64bit) \
libQt6QuickParticles.so.6(Qt_6)(64bit) \
libQt6QuickShapes.so.6()(64bit) \
libQt6QuickShapes.so.6(Qt_6)(64bit) \
libQt6QuickTemplates2.so.6()(64bit) \
libQt6QuickTemplates2.so.6(Qt_6)(64bit) \
libQt6QuickTest.so.6()(64bit) \
libQt6QuickTest.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
