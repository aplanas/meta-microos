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

RPM_NAME = "python39-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "572fdaa8e5f6c1f492125693b903909374dce1fc9b5de398713b71d04bc575151fe39519326b3d9b1c972c1ddb466310d6ced1189c7769ad8d0ddb8504ab2f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pamqp \
python39-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
