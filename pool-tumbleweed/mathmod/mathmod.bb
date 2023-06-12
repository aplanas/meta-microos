SUMMARY = "Mathematical modelling to visualise implicit and parametric surfaces"
DESCRIPTION = "MathMod is a mathematical modeling software to model, plot and animate \
3D/4D parametric and implicit surfaces. \
 \
Features: \
 * 3D and 4D plotting and animation \
 * OBJ output file format \
 * Scripting language in JSON file format \
 * Texture and pigmentation support \
 * Noise and Turbulence effects support \
 * Large set of scripted examples"
LICENSE = "GPL-2.0-or-later"

PV = "11.1"

RPM_NAME = "mathmod-11.1-1.7.aarch64.rpm"
RPM_HASH = "719ccfe083d0bde15fa19c6422f1ee23e65e240570922b644bf226c53857e7f62cbff3f4a58c010d333c427b4e579f62b86a62a2bd39a1de147106c85092ca54"

RPROVIDES:${PN} += "application() \
application(mathmod.desktop) \
mathmod \
mathmod(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
