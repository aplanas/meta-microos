SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-stomper-0.4.3-2.14.noarch.rpm"
RPM_HASH = "e23adbeafdd83316b678c25af4fe26077ca0f0bc0760ecd9c41197989309a7063f9b0c470af9939cab9f3e7d584105d8b28e052650e95f56a590ff336ffe8ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomper \
python3.11dist-stomper \
python311-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
