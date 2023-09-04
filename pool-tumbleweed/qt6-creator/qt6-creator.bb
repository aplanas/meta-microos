SUMMARY = "Integrated Development Environment targeting Qt apps"
DESCRIPTION = "Qt Creator is an integrated development environment (IDE) designed to \
facilitate development with the Qt application framework."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "11.0.2"

RPM_NAME = "qt6-creator-11.0.2-2.1.aarch64.rpm"
RPM_HASH = "89414c456769e994f8d31ba976d18065b276f3076f62cb17c8fd06e154de0edfdd6ac6f702b7ca47464c54667fbd73f22b09bb0335b9406a963edcf8713f55cb"

RPROVIDES:${PN} += "libAdvancedDockingSystem.so.11 \
libAggregation.so.11 \
libAndroid.so \
libAutoTest.so \
libAutotoolsProjectManager.so \
libAxivion.so \
libBareMetal.so \
libBazaar.so \
libBeautifier.so \
libBinEditor.so \
libBookmarks.so \
libBoot2Qt.so \
libCMakeProjectManager.so \
libCPlusPlus.so.11 \
libCVS.so \
libClangCodeModel.so \
libClangTools.so \
libClassView.so \
libClearCase.so \
libCoco.so \
libCodePaster.so \
libCompilationDatabaseProjectManager.so \
libConan.so \
libCopilot.so \
libCore.so \
libCppEditor.so \
libCppcheck.so \
libCtfVisualizer.so \
libDebugger.so \
libDesigner.so \
libDiffEditor.so \
libDocker.so \
libEmacsKeys.so \
libExtensionSystem.so.11 \
libFakeVim.so \
libFossil.so \
libGLSL.so.11 \
libGLSLEditor.so \
libGenericProjectManager.so \
libGit.so \
libGitLab.so \
libHaskell.so \
libHelloWorld.so \
libHelp.so \
libImageViewer.so \
libIncrediBuild.so \
libIos.so \
libKSyntaxHighlighting.so.11 \
libLanguageClient.so \
libLanguageServerProtocol.so.11 \
libLanguageUtils.so.11 \
libMacros.so \
libMarketplace.so \
libMcuSupport.so \
libMercurial.so \
libMesonProjectManager.so \
libModelEditor.so \
libModeling.so.11 \
libNim.so \
libPerfProfiler.so \
libPerforce.so \
libProParser.so.11 \
libProjectExplorer.so \
libPython.so \
libQbsProjectManager.so \
libQmakeProjectManager.so \
libQmlDebug.so.11 \
libQmlDesignerBase.so \
libQmlEditorWidgets.so.11 \
libQmlJS.so.11 \
libQmlJSEditor.so \
libQmlJSTools.so \
libQmlPreview.so \
libQmlProfiler.so \
libQmlProjectManager.so \
libQnx.so \
libQtSupport.so \
libRemoteLinux.so \
libResourceEditor.so \
libSafeRenderer.so \
libScxmlEditor.so \
libSerialTerminal.so \
libSilverSearcher.so \
libSqlite.so.11 \
libSquish.so \
libSubversion.so \
libTerminal.so \
libTextEditor.so \
libTodo.so \
libTracing.so.11 \
libUtils.so.11 \
libValgrind.so \
libVcpkg.so \
libVcsBase.so \
libWebAssembly.so \
libWelcome.so \
libqlitehtml.so.11 \
libqt5-creator \
qt5-creator \
qt6-creator"

RDEPENDS:${PN} += "/sbin/ldconfig \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Designer.so.6 \
libQt6DesignerComponents.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DParticles.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6QuickWidgets.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyaml-cpp.so.0.8 \
libzstd.so.1 \
qt6-sql-sqlite \
qt6qmlimport-Qt.labs.platform.1 \
qt6qmlimport-Qt.labs.qmlmodels.1 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Controls.6 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Shapes.1 \
qt6qmlimport-QtQuick.Templates.2 \
qt6qmlimport-QtQuick.Timeline.1 \
qt6qmlimport-QtQuick.Window.2"

inherit rpm
