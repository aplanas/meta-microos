SUMMARY = "PHP plugin for Kdevelop5 Integrated Development Environment"
DESCRIPTION = "PHP plugin for Kdevelop Integrated Development Environment \
 \
This plugin enables support for the following features for developing \
web applications in PHP using Kdevelop5. \
 \
  * PHP built-in functions, classes, constants, superglobals \
  * user-defined functions, classes, constants, superglobals, variables, etc. \
  * proper code completion for objects which respects access modifiers (private, \
    public, protected) and differentiates between static/non-static members and \
    methods \
  * code completion for overridable and implementable functions inside classes \
  * hints in the argument list of function- and method class \
  * sane code completion after keywords such as extends, implements, catch(), \
    new, throw and some more"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-plugin-php-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4eca5eaaf1475bc82f7f6ec9166a2ddfed6dc7563d06b64c83aebab69922ecfe6f56fbfb860a19648b13cd0597a77e6cccab9cb9b99cfbb54e8cc021dd8c79e2"

RPROVIDES:${PN} += "kdevelop5-plugin-php \
libkdevphpcompletion.so \
libkdevphpduchain.so \
libkdevphpparser.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevelop5 \
ld-linux-aarch64.so.1 \
libKDevPlatformDocumentation.so.511 \
libKDevPlatformInterfaces.so.511 \
libKDevPlatformLanguage.so.511 \
libKDevPlatformOutputView.so.511 \
libKDevPlatformProject.so.511 \
libKDevPlatformSerialization.so.511 \
libKDevPlatformUtil.so.511 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextEditor.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
