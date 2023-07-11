SUMMARY = "Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. It allows \
evaluating and debugging of scripts, and advanced use of objects and \
functions. It also gives access to a low-level ECMAScript engine API."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.14"

RPM_NAME = "libQt5Script5-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "a5e7f58889a6f938cdb6f5e8a3ee5193a282f3ee86578bc8a73b7db5b1701a6d791c41a02502cdd8bd42a8a1228c1bc7d278ba79280b5780c4177ddaf29484d9"

RPROVIDES:${PN} += "libQt5Script.so.5 \
libQt5Script5 \
libQt5ScriptTools.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
