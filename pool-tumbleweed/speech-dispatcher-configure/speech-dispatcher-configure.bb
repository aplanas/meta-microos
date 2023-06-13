SUMMARY = "Configuration tool for Speech Dispatcher"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem. \
 \
This package contains spd-conf, a configuration tool for Speech \
Dispatcher."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.11.4"

RPM_NAME = "speech-dispatcher-configure-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "b1a8f61cda275c5c27a43e11bfb03094194c03e39cef159ebf65c6d04b72b7dbba425acf54130256ffc3912846273a9f501b6d702cd993edc8659b31b4c805c9"

RPROVIDES:${PN} += "speech-dispatcher-configure \
speech-dispatcher-configure(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-pyxdg \
speech-dispatcher"

inherit rpm
