SUMMARY = "Qt 6 Declarative QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Declarative module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "67cc3e720361fd6da0a9466dc0a4a4b2f09189f78c888bf0882d7785f88244973fe210eea37f65ec4572794a62c37a66d16c347e542701b90848182bdb893a8f"

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
