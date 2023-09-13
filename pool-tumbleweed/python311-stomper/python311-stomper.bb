SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-stomper-0.4.3-3.1.noarch.rpm"
RPM_HASH = "23b967cbe6690e42caa1f8dc2a7e19f79eb632116b25c0f5f4b13a52b30b2c7467246fe0c38cfdd5a95d58360cf2c2008d14acff08cd919dc44131d3f9fdeb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomper \
python3.11dist-stomper \
python311-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
