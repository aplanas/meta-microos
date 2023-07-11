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

RPM_NAME = "python3-speechd-0.11.4-2.1.aarch64.rpm"
RPM_HASH = "a9635d61d22b4260cd4cea2c39f9d3cc8fd313034b2b7413dd159c17453572bd97d2c4c5dd5c13f82b0bbd6fcad2827311cf6e7ddcb8e81cc3fb10f87598ffeb"

RPROVIDES:${PN} += "python3-speechd"

RDEPENDS:${PN} += "python-abi \
speech-dispatcher"

inherit rpm
