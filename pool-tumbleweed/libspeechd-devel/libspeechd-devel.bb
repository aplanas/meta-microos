SUMMARY = "Device independent layer for speech synthesis - Development files"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.4"

RPM_NAME = "libspeechd-devel-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "86e9d3d13122ff2de6636365e2ab88b749df122a92b7e834c0e830229d9035c1ee4a94d10337a7423a5791b76e2c553b1e0dd14e88882f4b849c48cdc978f88a"

RPROVIDES:${PN} += "libspeechd-devel \
pkgconfig-speech-dispatcher \
speech-dispatcher-devel \
speechd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeechd2 \
pkgconfig-glib-2.0"

inherit rpm
