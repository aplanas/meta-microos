SUMMARY = "DMM Readout Software Including a Configurable Recorder"
DESCRIPTION = "QtDMM is a DMM readout software including a configurable recorder. The \
recorder features manual start, scheduled start (at a given time), and \
triggered automatic start when given thresholds are reached. \
Additionally, you can start an external application when given \
thresholds are reached. \
 \
Although initially written for Metex (and compatible, like VOLTCRAFT) \
multimeter, which use a 14-byte protocol, several more protocols have \
been added. For more information about the currently supported DMMs, \
refer to the preset table."
LICENSE = "GPL-3.0-only"

PV = "0.9.8"

RPM_NAME = "QtDMM-0.9.8-4.1.aarch64.rpm"
RPM_HASH = "b4c0d81fdb2f5e32c601c5049f57dee23b03e6065d6486c83570e31ffc3eed0de8d2553dc345599cdc7b43ba329ac639ad7f1cc3f741033375a8d6ed3c6ac3f8"

RPROVIDES:${PN} += "QtDMM QtDMM(aarch-64) application() application(QtDMM.desktop)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5SerialPort.so.5()(64bit) libQt5SerialPort.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
