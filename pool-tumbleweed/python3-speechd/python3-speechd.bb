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

PV = "0.11.4"

RPM_NAME = "python3-speechd-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "6c88e5e0d03b31dca3bb51043bda123924c07bbec72acb4db895e189f09f4c73cc2b87c7d8bf7c09cc0365105adaaf109b4a010a180819df2a42eacbe90082e7"

RPROVIDES:${PN} += "python3-speechd"

RDEPENDS:${PN} += "python-abi \
speech-dispatcher"

inherit rpm
