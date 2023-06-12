SUMMARY = "Example applications for the FOX GUI toolkit"
DESCRIPTION = "The example-apps package contains executables for several FOX-based \
applications, including: \
 \
* Adie : Programmer's Text Editor \
 \
* calculator : Calculator Applet \
 \
* shutterbug : Screenshot Utility \
 \
* PathFinder : File Browser"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-example-apps-1.6.57-4.1.aarch64.rpm"
RPM_HASH = "6d3bdf807f1b0f226635c266923d49782f6269e499519cc642e624eb1e1fe5694a1f565c8dd6fd7c98cda2daa603f532a8a4a015719473d3d9ac809eeb11a7e2"

RPROVIDES:${PN} += "application() application(adie.desktop) application(calculator.desktop) application(pathfinder.desktop) fox-example-apps fox16-example-apps fox16-example-apps(aarch-64) mimehandler(text/english) mimehandler(text/plain)"
RDEPENDS:${PN} += "libFOX-1.6.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
