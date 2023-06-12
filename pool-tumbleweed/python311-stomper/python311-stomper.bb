SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-stomper-0.4.3-2.12.noarch.rpm"
RPM_HASH = "cfb4c594b81c56d154e229233218d63988efb35743ac02d581ad6dc81719c58aeb03e4699b4e568242d02132db008d31da5539bbc7ebcef381df1d5bd7bf4cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stomper) \
python311-stomper \
python3dist(stomper)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
