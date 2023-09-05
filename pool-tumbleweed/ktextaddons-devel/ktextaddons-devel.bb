SUMMARY = "Development files for ktextaddons, a library for handling texts"
DESCRIPTION = "This package provides development files to use ktextaddons in other applications."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ktextaddons-devel-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "990ee9b220e848cd706e7d026eb91b57c5a14b044630514cf279a54954d080686bbf2ae30e1fbdee68ed587d443670278be01211abf24ad27e291a4370b786bb"

RPROVIDES:${PN} += "cmake-KF5TextAddonsWidgets \
cmake-KF5TextAutoCorrectionCore \
cmake-KF5TextAutoCorrectionWidgets \
cmake-KF5TextEditTextToSpeech \
cmake-KF5TextEmoticonsCore \
cmake-KF5TextEmoticonsWidgets \
cmake-KF5TextGrammarCheck \
cmake-KF5TextTranslator \
cmake-KF5TextUtils \
ktextaddons-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5TextAddonsWidgets1 \
libKF5TextAutoCorrectionCore1 \
libKF5TextAutoCorrectionWidgets1 \
libKF5TextEditTextToSpeech1 \
libKF5TextEmoticonsCore1 \
libKF5TextEmoticonsWidgets1 \
libKF5TextGrammarCheck1 \
libKF5TextTranslator.so.1 \
libKF5TextTranslator1 \
libKF5TextUtils1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
