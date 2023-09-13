SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-stomper-0.4.3-3.1.noarch.rpm"
RPM_HASH = "1f1bfa5ed174b7970fa4098d6fc1d09d1e4fc96de4603892022b268ceb0f694be4f7ea68e918208aa54dc1d40e39a1b1cfd125b60bc84c6b4884f488fa204c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stomper \
python39-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
