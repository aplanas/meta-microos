SUMMARY = "Perl bindings for libyui"
DESCRIPTION = "This package provides Perl language bindings to access functions of \
yast2-libyui - An User Interface engine that provides the \
abstraction from graphical user interfaces (Qt, Gtk) and text based \
user interfaces (ncurses). \
 \
Authors: \
--------- \
-    kkaempf@suse.de \
-    dmacvicar@suse.de"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "perl-yui-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "da8a7a34db626178fe70a1f89a36442fe68cdacc8ce4cd91fb4010b15ee439efa79a436344ce8d498305f658573c8dd1c1e689ff745571a72ddc9a5b0a2e4ca6"

RPROVIDES:${PN} += "perl-yui \
perl-yui--YAlignment \
perl-yui--YApplication \
perl-yui--YBarGraph \
perl-yui--YBarGraphMultiUpdate \
perl-yui--YBarGraphSegment \
perl-yui--YBuiltinCaller \
perl-yui--YBusyIndicator \
perl-yui--YCancelEvent \
perl-yui--YCheckBox \
perl-yui--YCheckBoxFrame \
perl-yui--YCodeLocation \
perl-yui--YColor \
perl-yui--YComboBox \
perl-yui--YCommandLine \
perl-yui--YDateField \
perl-yui--YDebugEvent \
perl-yui--YDialog \
perl-yui--YDownloadProgress \
perl-yui--YDumbTab \
perl-yui--YEmpty \
perl-yui--YEvent \
perl-yui--YExternalWidgetFactory \
perl-yui--YExternalWidgets \
perl-yui--YFrame \
perl-yui--YImage \
perl-yui--YInputField \
perl-yui--YIntField \
perl-yui--YItem \
perl-yui--YItemCollection \
perl-yui--YItemSelector \
perl-yui--YItemShortcut \
perl-yui--YKeyEvent \
perl-yui--YLabel \
perl-yui--YLayoutBox \
perl-yui--YLogView \
perl-yui--YMacro \
perl-yui--YMacroPlayer \
perl-yui--YMacroRecorder \
perl-yui--YMenuBar \
perl-yui--YMenuButton \
perl-yui--YMenuEvent \
perl-yui--YMenuItem \
perl-yui--YMenuWidget \
perl-yui--YMultiLineEdit \
perl-yui--YMultiProgressMeter \
perl-yui--YMultiSelectionBox \
perl-yui--YOptionalWidgetFactory \
perl-yui--YPackageSelector \
perl-yui--YPackageSelectorPlugin \
perl-yui--YPartitionSplitter \
perl-yui--YProgressBar \
perl-yui--YProperty \
perl-yui--YPropertySet \
perl-yui--YPropertyValue \
perl-yui--YPushButton \
perl-yui--YRadioButton \
perl-yui--YRadioButtonGroup \
perl-yui--YReplacePoint \
perl-yui--YRichText \
perl-yui--YSelectionBox \
perl-yui--YSelectionWidget \
perl-yui--YSettings \
perl-yui--YShortcut \
perl-yui--YShortcutManager \
perl-yui--YSimpleEventHandler \
perl-yui--YSimpleInputField \
perl-yui--YSingleChildContainerWidget \
perl-yui--YSlider \
perl-yui--YSpacing \
perl-yui--YSpecialKeyEvent \
perl-yui--YSquash \
perl-yui--YStringTree \
perl-yui--YStringWidgetID \
perl-yui--YTable \
perl-yui--YTableCell \
perl-yui--YTableHeader \
perl-yui--YTableItem \
perl-yui--YTimeField \
perl-yui--YTimeoutEvent \
perl-yui--YTimezoneSelector \
perl-yui--YTransText \
perl-yui--YTree \
perl-yui--YTreeItem \
perl-yui--YUI \
perl-yui--YUIBadPropertyArgException \
perl-yui--YUIButtonRoleMismatchException \
perl-yui--YUICantLoadAnyUIException \
perl-yui--YUIDialogStackingOrderException \
perl-yui--YUIException \
perl-yui--YUIIndexOutOfRangeException \
perl-yui--YUIInvalidDimensionException \
perl-yui--YUIInvalidWidgetException \
perl-yui--YUILoader \
perl-yui--YUILog \
perl-yui--YUINoDialogException \
perl-yui--YUINullPointerException \
perl-yui--YUIOutOfMemoryException \
perl-yui--YUIPlugin \
perl-yui--YUIPluginException \
perl-yui--YUIPropertyException \
perl-yui--YUIPropertyTypeMismatchException \
perl-yui--YUISetReadOnlyPropertyException \
perl-yui--YUISyntaxErrorException \
perl-yui--YUIUnknownPropertyException \
perl-yui--YUIUnsupportedWidgetException \
perl-yui--YUIWidgetNotFoundException \
perl-yui--YWidget \
perl-yui--YWidgetEvent \
perl-yui--YWidgetFactory \
perl-yui--YWidgetID \
perl-yui--YWizard \
perl-yuic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libperl.so \
libstdc++.so.6 \
libyui.so.16 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
