SUMMARY = "Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. It allows \
evaluating and debugging of scripts, and advanced use of objects and \
functions. It also gives access to a low-level ECMAScript engine API."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.12"

RPM_NAME = "libQt5Script5-5.15.12-2.3.aarch64.rpm"
RPM_HASH = "9aac9ce986c2e9007d43afe2e6feccd6cc2ef15b65572b94f0a48c95e60d13545ef0076287a4f9a66828e37a84cb7cb24db9e98646167987d900560d41a8ce37"

RPROVIDES:${PN} += "libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Script.so.5(Qt_5.0)(64bit) \
libQt5Script.so.5(Qt_5.1)(64bit) \
libQt5Script.so.5(Qt_5.10)(64bit) \
libQt5Script.so.5(Qt_5.11)(64bit) \
libQt5Script.so.5(Qt_5.12)(64bit) \
libQt5Script.so.5(Qt_5.13)(64bit) \
libQt5Script.so.5(Qt_5.14)(64bit) \
libQt5Script.so.5(Qt_5.15)(64bit) \
libQt5Script.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Script.so.5(Qt_5.2)(64bit) \
libQt5Script.so.5(Qt_5.3)(64bit) \
libQt5Script.so.5(Qt_5.4)(64bit) \
libQt5Script.so.5(Qt_5.5)(64bit) \
libQt5Script.so.5(Qt_5.6)(64bit) \
libQt5Script.so.5(Qt_5.7)(64bit) \
libQt5Script.so.5(Qt_5.8)(64bit) \
libQt5Script.so.5(Qt_5.9)(64bit) \
libQt5Script5 \
libQt5Script5(aarch-64) \
libQt5ScriptTools.so.5()(64bit) \
libQt5ScriptTools.so.5(Qt_5)(64bit) \
libQt5ScriptTools.so.5(Qt_5.0)(64bit) \
libQt5ScriptTools.so.5(Qt_5.1)(64bit) \
libQt5ScriptTools.so.5(Qt_5.10)(64bit) \
libQt5ScriptTools.so.5(Qt_5.11)(64bit) \
libQt5ScriptTools.so.5(Qt_5.12)(64bit) \
libQt5ScriptTools.so.5(Qt_5.13)(64bit) \
libQt5ScriptTools.so.5(Qt_5.14)(64bit) \
libQt5ScriptTools.so.5(Qt_5.15)(64bit) \
libQt5ScriptTools.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5ScriptTools.so.5(Qt_5.2)(64bit) \
libQt5ScriptTools.so.5(Qt_5.3)(64bit) \
libQt5ScriptTools.so.5(Qt_5.4)(64bit) \
libQt5ScriptTools.so.5(Qt_5.5)(64bit) \
libQt5ScriptTools.so.5(Qt_5.6)(64bit) \
libQt5ScriptTools.so.5(Qt_5.7)(64bit) \
libQt5ScriptTools.so.5(Qt_5.8)(64bit) \
libQt5ScriptTools.so.5(Qt_5.9)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets5 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm