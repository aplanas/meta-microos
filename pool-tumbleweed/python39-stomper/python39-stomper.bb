SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-stomper-0.4.3-2.14.noarch.rpm"
RPM_HASH = "7ab9c643cb74505432322f0668882550189bf590d5cda59aff11de6786f80750d6deb926808a29a2b26a587d4fd9bd699a67e9865b4acb082e07920adf8057a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stomper \
python39-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
