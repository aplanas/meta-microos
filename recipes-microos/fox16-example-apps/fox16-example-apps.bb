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

RPM_NAME = "fox16-example-apps-1.6.57-2.1.aarch64.rpm"
RPM_HASH = "56e3e2bd65268d21c8fc17d72a788aec853f7f70f08fe4b95083a41cad638869aec9c71377dbd2ba029187018f90d7866e0915fa43535551fba1c7bc6b6da9c5"

RPROVIDES:${PN} += "application() application(adie.desktop) application(calculator.desktop) application(pathfinder.desktop) fox-example-apps fox16-example-apps fox16-example-apps(aarch-64) mimehandler(text/english) mimehandler(text/plain)"
RDEPENDS:${PN} += "libFOX-1.6.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
