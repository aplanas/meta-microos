SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-stomper-0.4.3-2.14.noarch.rpm"
RPM_HASH = "364fcb08bbc4ebd973f01aeb6421d17ea7e1eb0c1a135c5838cfa4904f596c65d53db2777dc7d82eeddc243a360974161ed70f136a12dc831a6d60e1fcaeec0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stomper \
python310-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
