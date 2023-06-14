SUMMARY = "A collection of plugins for gedit"
DESCRIPTION = "This package contains a number of plugins for gedit, such as: \
 \
 * Bracket Completion: Automatically adds a closing bracket when you \
   insert an opening one \
 * Charmap: Select characters from a charactermap \
 * Code Comment: Comment or uncomment blocks of code \
 * Color picker: Select and insert a color from a dialog (for html, \
   css, php) \
 * Join lines/Split lines: Join or split multiple lines through Ctrl+J \
   and Ctrl+Shift+J \
 * Session Saver: Allows to bookmark working sessions in order to get \
   them back for further use \
 * Smart Spaces: Allows to unindent like if you were using tabs while \
   you're using spaces \
 * Show tabbar: A plugin to show or hide the gedit tabbar \
 * Terminal: A terminal widget accessible from the bottom panel"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugins-44.1-1.3.aarch64.rpm"
RPM_HASH = "cb01a1c00b1999757820699e2312e20f912583e762abbe08a60b3e7bd7c3b80fde31cdc99fb083e1fac7ac45fa7aa9a3d51a2793e12a7817c42873f77e6b3a81"

RPROVIDES:${PN} += "gedit-plugins"

RDEPENDS:${PN} += "gedit"

inherit rpm
