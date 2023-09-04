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

PV = "0.11.5"

RPM_NAME = "speech-dispatcher-configure-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "5d744c947b88b232eb1cb7c17954f75a50747c433750f66b6ac5e6fa6eff32c8721237cfa07cc329744c1b093ac6b8f86959046ad263fe4e77688f13a47fdcb2"

RPROVIDES:${PN} += "speech-dispatcher-configure"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-pyxdg \
speech-dispatcher"

inherit rpm
