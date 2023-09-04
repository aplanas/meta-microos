SUMMARY = "Device independent layer for speech synthesis - Python Bindings"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "python3-speechd-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "b438e776b6834422361d2ca2dd47c310a1076987f84ea2b403dd9b9ede80c6c86f6b59268926dd4598be7e4746886718b7d65dfd82720c06e6cf00b2dec9a909"

RPROVIDES:${PN} += "python3-speechd"

RDEPENDS:${PN} += "python-abi \
speech-dispatcher"

inherit rpm
