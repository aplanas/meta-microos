SUMMARY = "Framework for collecting feedback from application users"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. It is designed to be compliant with the \
KDE Telemetry Policy, which forbids the usage of unique identification."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libKUserFeedbackCore1-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "f61a4523d73dca0f90dfa6ce7424bf3205e995058a57557d2463d4f47601262f9e4bddafa7a4b76bdef22eae4fcc9b08e0a65f6734e5ccfd16d386cb3f88e900"

RPROVIDES:${PN} += "kuserfeedback \
libKUserFeedbackCore.so.1 \
libKUserFeedbackCore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
