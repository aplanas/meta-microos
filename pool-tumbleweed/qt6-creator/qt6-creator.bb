SUMMARY = "Integrated Development Environment targeting Qt apps"
DESCRIPTION = "Qt Creator is an integrated development environment (IDE) designed to \
facilitate development with the Qt application framework."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "10.0.1"

RPM_NAME = "qt6-creator-10.0.1-2.2.aarch64.rpm"
RPM_HASH = "5226179481621f64ede7dad8f6e84f1eb3b57f0de6be3b73e198060f34f4a07192fc67258415162d2fed0d278934ebdbaa6e932cf2c05b50152a73984b04da69"

RPROVIDES:${PN} += "libAdvancedDockingSystem.so.10 \
libAggregation.so.10 \
libAndroid.so \
libAutoTest.so \
libAutotoolsProjectManager.so \
libBareMetal.so \
libBazaar.so \
libBeautifier.so \
libBinEditor.so \
libBookmarks.so \
libBoot2Qt.so \
libCMakeProjectManager.so \
libCPlusPlus.so.10 \
libCVS.so \
libClangCodeModel.so \
libClangTools.so \
libClassView.so \
libClearCase.so \
libCoco.so \
libCodePaster.so \
libCompilationDatabaseProjectManager.so \
libConan.so \
libCore.so \
libCppEditor.so \
libCppcheck.so \
libCtfVisualizer.so \
libDebugger.so \
libDesigner.so \
libDiffEditor.so \
libDocker.so \
libEmacsKeys.so \
libExtensionSystem.so.10 \
libFakeVim.so \
libFossil.so \
libGLSL.so.10 \
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
libKSyntaxHighlighting.so.10 \
libLanguageClient.so \
libLanguageServerProtocol.so.10 \
libLanguageUtils.so.10 \
libMacros.so \
libMarketplace.so \
libMcuSupport.so \
libMercurial.so \
libMesonProjectManager.so \
libModelEditor.so \
libModeling.so.10 \
libNim.so \
libPerfProfiler.so \
libPerforce.so \
libProParser.so.10 \
libProjectExplorer.so \
libPython.so \
libQbsProjectManager.so \
libQmakeProjectManager.so \
libQmlDebug.so.10 \
libQmlDesigner.so \
libQmlEditorWidgets.so.10 \
libQmlJS.so.10 \
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
libSqlite.so.10 \
libSquish.so \
libStudioPlugin.so \
libStudioWelcome.so \
libSubversion.so \
libTextEditor.so \
libTodo.so \
libTracing.so.10 \
libUtils.so.10 \
libValgrind.so \
libVcsBase.so \
libWebAssembly.so \
libWelcome.so \
libassetexporterplugin.so \
libcomponentsplugin.so \
libqlitehtml.so.10 \
libqmlpreviewplugin.so \
libqt5-creator \
libqtquickplugin.so \
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
libyaml-cpp.so.0.7 \
libzstd.so.1 \
qt6-sql-sqlite"

inherit rpm
