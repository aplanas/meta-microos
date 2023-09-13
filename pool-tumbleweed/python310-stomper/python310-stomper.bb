SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-stomper-0.4.3-3.1.noarch.rpm"
RPM_HASH = "32740b77725b7abbf2037d04a16bbc1d0f852996bad733f4da57cbe11e8f54081b8896ed6f6bed15ea4b7ea09b8475239d20158a1d0f4ad9cb37e825bf0736bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stomper \
python310-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
