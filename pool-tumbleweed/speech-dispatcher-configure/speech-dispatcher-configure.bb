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

RPM_NAME = "speech-dispatcher-configure-0.11.4-2.1.aarch64.rpm"
RPM_HASH = "fc973b95187d993b2e963feb866af39b43b0d49a59e71ade6000c25ea92c9fa644f7e4120da193ffb9922c0cfbe5b57364bf1ed137c390b9bbc9c453cfae55ee"

RPROVIDES:${PN} += "speech-dispatcher-configure"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-pyxdg \
speech-dispatcher"

inherit rpm
