SUMMARY = "Development files for ktextaddons, a library for handling texts"
DESCRIPTION = "This package provides development files to use ktextaddons in other applications."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "ktextaddons-devel-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "c3f0cd0968b7d90a88e5d0f847af5ef3576a62309c5da579b9602297a2a241b744f59ced144cffa510ec93d435cdfc3ddb47ba50d2e50e2cfd74106126abf4f2"

RPROVIDES:${PN} += "cmake(KF5TextAutoCorrection) \
cmake(KF5TextEditTextToSpeech) \
cmake(KF5TextGrammarCheck) \
cmake(KF5TextTranslator) \
ktextaddons-devel \
ktextaddons-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5TextAutoCorrection1 \
libKF5TextEditTextToSpeech1 \
libKF5TextGrammarCheck1 \
libKF5TextTranslator.so.1()(64bit) \
libKF5TextTranslator1 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
