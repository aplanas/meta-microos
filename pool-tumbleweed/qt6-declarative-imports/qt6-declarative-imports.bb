SUMMARY = "Qt 6 Declarative QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Declarative module."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-imports-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "04552eecb1da3c68d1620df5e81729d8d37429a564b3e46379abdf3580454bda5f092ea438101bf333c72d002583cffe6c0a7a4a665ea12e10a0354a593a8323"

RPROVIDES:${PN} += "libeffectsplugin.so \
liblabsanimationplugin.so \
liblabsmodelsplugin.so \
libmodelsplugin.so \
libparticlesplugin.so \
libqmlfolderlistmodelplugin.so \
libqmllocalstorageplugin.so \
libqmlmetaplugin.so \
libqmlplugin.so \
libqmlsettingsplugin.so \
libqmlshapesplugin.so \
libqmlwavefrontmeshplugin.so \
libqmlxmllistmodelplugin.so \
libqquicklayoutsplugin.so \
libqtlabsplatformplugin.so \
libqtqmlcoreplugin.so \
libqtquick2plugin.so \
libqtquickcontrols2basicstyleimplplugin.so \
libqtquickcontrols2basicstyleplugin.so \
libqtquickcontrols2fusionstyleimplplugin.so \
libqtquickcontrols2fusionstyleplugin.so \
libqtquickcontrols2imaginestyleimplplugin.so \
libqtquickcontrols2imaginestyleplugin.so \
libqtquickcontrols2implplugin.so \
libqtquickcontrols2materialstyleimplplugin.so \
libqtquickcontrols2materialstyleplugin.so \
libqtquickcontrols2nativestyleplugin.so \
libqtquickcontrols2plugin.so \
libqtquickcontrols2universalstyleimplplugin.so \
libqtquickcontrols2universalstyleplugin.so \
libqtquickdialogs2quickimplplugin.so \
libqtquickdialogsplugin.so \
libqtquicktemplates2plugin.so \
libquickcontrolstestutilsprivateplugin.so \
libquicktestplugin.so \
libquicktoolingplugin.so \
libquickwindowplugin.so \
libsharedimageplugin.so \
libworkerscriptplugin.so \
qt6-declarative-imports \
qt6-quickcontrols2-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6LabsAnimation.so.6 \
libQt6LabsFolderListModel.so.6 \
libQt6LabsQmlModels.so.6 \
libQt6LabsSettings.so.6 \
libQt6LabsSharedImage.so.6 \
libQt6LabsWavefrontMesh.so.6 \
libQt6Qml.so.6 \
libQt6QmlCore.so.6 \
libQt6QmlLocalStorage.so.6 \
libQt6QmlModels.so.6 \
libQt6QmlWorkerScript.so.6 \
libQt6QmlXmlListModel.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickControls2Impl.so.6 \
libQt6QuickDialogs2.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickEffects.so.6 \
libQt6QuickLayouts.so.6 \
libQt6QuickParticles.so.6 \
libQt6QuickShapes.so.6 \
libQt6QuickTemplates2.so.6 \
libQt6QuickTest.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
