SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-stomper-0.4.3-2.12.noarch.rpm"
RPM_HASH = "e47782b7c9a6d0ec728d678decf075f65263d607a13169ec70d1d089c88f2ca10fd64205295876df448e8b4a2350ba907b9b3ad5effcd485d2842cef856ce883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomper \
python3.10dist-stomper \
python310-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
