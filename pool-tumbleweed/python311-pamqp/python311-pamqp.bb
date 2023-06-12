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

RPM_NAME = "python311-pamqp-3.2.1-1.3.noarch.rpm"
RPM_HASH = "a839c93c165bc1d393602432e2cbd1a1c300221ad024de4b9cfe22b861c4432a3d995149ff3e893461c762e9c4b85f60d8723d7522c33cc2c53dd86c1481fa78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pamqp) \
python311-pamqp \
python3dist(pamqp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
