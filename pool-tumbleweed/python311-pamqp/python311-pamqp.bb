SUMMARY = "Pure-python AMQP 0-9-1 frame encoder and decoder"
DESCRIPTION = "pamqp is a pure-python AMQP 0-9-1 frame encoder and decoder. \
 \
pamqp is not a end-user client library for talking to RabbitMQ but \
rather is used by client libraries for marshaling and unmarshaling \
AMQP frames. \
 \
AMQP class/method command class mappings can be found in the \
pamqp.specification module while actual frame encoding and \
encoding should be run through the pamqp.frame module."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "b73deb78e0a4dc8dadfc88b3e2a665d947a09d93697c9ea83f980162a143a066bac95111280811f6e154d445ac3a798061c93524ee6c006691c5443c86a9dd97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamqp \
python3.11dist-pamqp \
python311-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
