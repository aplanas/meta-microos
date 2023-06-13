SUMMARY = "Simulator Construction Gear"
DESCRIPTION = "SimGear is a set of open-source libraries designed to be used as building \
blocks for quickly assembling 3D simulations, games, and visualization \
applications. \
 \
SimGear is developed as part of the FlightGear project and used by the \
FlightGear flight simulator and many of its related utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2020.3.18"

RPM_NAME = "libSimGearCore-2020_3_18-2020.3.18-1.1.aarch64.rpm"
RPM_HASH = "90ed2b0209477fd6f2fc4ba0beae78b4b4535e49a48775184df94a0face80b8c18cc2ec08826cbff3acca2285844ba8e7a45cf66def09418cfe5b406618527cd"

RPROVIDES:${PN} += "libSimGearCore-2020_3_18 \
libSimGearCore-2020_3_18(aarch-64) \
libSimGearCore.so.2020.3.18()(64bit) \
libSimGearScene.so.2020.3.18()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
OpenSceneGraph-plugins \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libOpenThreads.so.21()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenal.so.1()(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgGA.so.161()(64bit) \
libosgParticle.so.161()(64bit) \
libosgSim.so.161()(64bit) \
libosgText.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudns.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit)"

inherit rpm
